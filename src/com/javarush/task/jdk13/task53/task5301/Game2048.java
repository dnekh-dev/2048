package com.javarush.task.jdk13.task53.task5301;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {

    private static final int SIDE = 4;  // Size of the game field
    private int[][] gameField = new int[SIDE][SIDE];  // 2D array representing the game field
    private boolean isGameStopped = false;  // Flag to check if the game is stopped
    private int score = 0;  // Variable to hold the game score

    // Initialize the game
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        score = 0;  // Reset score at the beginning
        setScore(score);
        createGame();
        drawScene();
    }

    // Create a new game
    private void createGame() {
        gameField = new int[SIDE][SIDE];  // Initialize the game field
        createNewNumber();  // Create the first number on the game field
        createNewNumber();  // Create the second number on the game field
    }

    // Draw the game scene
    private void drawScene() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                setCellColoredNumber(j, i, gameField[i][j]);
            }
        }
    }

    // Set the score and update the display
    @Override
    public void setScore(int score) {
        super.setScore(score);
        showMessageDialog(Color.WHITE, "", Color.WHITE, 1);
    }

    // Display win message and stop the game
    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "You win!", Color.AQUA, 20);
    }

    // Display game over message and stop the game
    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "Game over!", Color.AQUA, 20);
    }

    // Create a new number on the game field
    private void createNewNumber() {
        // Check if player has reached the winning tile
        if (getMaxTileValue() == 2048) {
            win();
            return;
        }

        // Check if the player can make any moves
        if (!canUserMove()) {
            gameOver();
            return;
        }

        // Generate new number in a random empty cell
        int randomColumn;
        int randomRow;
        do {
            randomColumn = getRandomNumber(SIDE);
            randomRow = getRandomNumber(SIDE);
        } while (gameField[randomRow][randomColumn] != 0);

        gameField[randomRow][randomColumn] = (getRandomNumber(10) == 9) ? 4 : 2;
    }

    // Set the color and value of a cell
    private void setCellColoredNumber(int x, int y, int value) {
        Color cellColor = getColorByValue(value);
        String cellValue = value == 0 ? "" : String.valueOf(value);
        setCellValueEx(x, y, cellColor, cellValue);
    }

    // Get color based on the tile value
    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.YELLOW;
            case 2:
                return Color.GRAY;
            case 4:
                return Color.LINEN;
            case 8:
                return Color.SIENNA;
            case 16:
                return Color.FIREBRICK;
            case 32:
                return Color.GOLD;
            case 64:
                return Color.KHAKI;
            case 128:
                return Color.OLIVE;
            case 256:
                return Color.IVORY;
            case 512:
                return Color.LIGHTCORAL;
            case 1024:
                return Color.TAN;
            case 2048:
                return Color.SALMON;
            default:
                return Color.NONE;
        }
    }

    // Compress the row by moving all non-zero values to the left
    private boolean compressRow(int[] row) {
        boolean isChanged = false;
        int[] newRow = new int[row.length];
        int index = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] != 0) {
                newRow[index] = row[i];
                if (i != index) {
                    isChanged = true;
                }
                index++;
            }
        }

        System.arraycopy(newRow, 0, row, 0, row.length);

        return isChanged;
    }

    // Merge the row by combining adjacent tiles of the same value
    private boolean mergeRow(int[] row) {
        boolean isMerged = false;

        for (int i = 1; i < row.length; i++) {
            if (row[i - 1] == row[i] && row[i] != 0) {
                row[i - 1] *= 2;
                row[i] = 0;
                isMerged = true;
                score += row[i - 1];  // Update the score
                setScore(score);  // Display the updated score
                i++; // Skip the next element after merging
            }
        }

        return isMerged;
    }

    // Handle key press events
    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                score = 0;  // Reset score before restarting the game
                setScore(score);
                createGame();
                drawScene();
            }
            return;
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        if (key == Key.LEFT) {
            moveLeft();
        } else if (key == Key.RIGHT) {
            moveRight();
        } else if (key == Key.UP) {
            moveUp();
        } else if (key == Key.DOWN) {
            moveDown();
        }
        if (key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN) {
            drawScene();
        }
    }

    // Move tiles to the left
    private boolean moveLeft() {
        boolean isChanged = false;

        for (int i = 0; i < gameField.length; i++) {
            boolean compressBefore = compressRow(gameField[i]);
            boolean merge = mergeRow(gameField[i]);
            boolean compressAfter = compressRow(gameField[i]);

            if (compressBefore || merge || compressAfter) {
                isChanged = true;
            }
        }

        if (isChanged) {
            createNewNumber();  // Create new number only if the field was changed
        }

        return isChanged;
    }

    // Rotate the game field clockwise
    private void rotateClockwise() {
        int size = gameField.length;
        int[][] newMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newMatrix[j][size - 1 - i] = gameField[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            System.arraycopy(newMatrix[i], 0, gameField[i], 0, size);
        }
    }

    // Move tiles to the right
    private boolean moveRight() {
        rotateClockwise();
        rotateClockwise();
        boolean result = moveLeft();
        rotateClockwise();
        rotateClockwise();
        return result;
    }

    // Move tiles up
    private boolean moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        boolean result = moveLeft();
        rotateClockwise();
        return result;
    }

    // Move tiles down
    private boolean moveDown() {
        rotateClockwise();
        boolean result = moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        return result;
    }

    // Get the maximum tile value on the game field
    private int getMaxTileValue() {
        int max = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] > max) {
                    max = gameField[i][j];
                }
            }
        }
        return max;
    }

    // Check if the user can make any moves
    private boolean canUserMove() {
        // Check for empty cells
        for (int[] row : gameField) {
            for (int cell : row) {
                if (cell == 0) {
                    return true;
                }
            }
        }

        // Check for possible merges horizontally
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length - 1; j++) {
                if (gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }

        // Check for possible merges vertically
        for (int j = 0; j < gameField[0].length; j++) {
            for (int i = 0; i < gameField.length -
                    1; i++) {
                if (gameField[i][j] == gameField[i + 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
