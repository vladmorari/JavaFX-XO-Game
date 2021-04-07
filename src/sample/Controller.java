package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button buttonStart;
    public Label labelSet;
    public Label labelXorO;
    public Label labelWinner;
    public Button button00;
    public Button button01;
    public Button button02;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button20;
    public Button button21;
    public Button button22;
    public boolean flag = true;
    public int[][] arr = new int[3][3];

    public void buttonStartClick(ActionEvent e) {
        labelXorO.setText("X");
        labelWinner.setText("Winner ?");
        flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }

        button00.setDisable(false);
        button00.setText("");
        button01.setDisable(false);
        button01.setText("");
        button02.setDisable(false);
        button02.setText("");
        button10.setDisable(false);
        button10.setText("");
        button11.setDisable(false);
        button11.setText("");
        button12.setDisable(false);
        button12.setText("");
        button20.setDisable(false);
        button20.setText("");
        button21.setDisable(false);
        button21.setText("");
        button22.setDisable(false);
        button22.setText("");

    }

    public void finish() {
        button00.setDisable(true);
        button01.setDisable(true);
        button02.setDisable(true);
        button10.setDisable(true);
        button11.setDisable(true);
        button12.setDisable(true);
        button20.setDisable(true);
        button21.setDisable(true);
        button22.setDisable(true);

    }

    public void check(int sum) {
        if (sum == 3) {
            finish();
            labelWinner.setText("Winner X");
        }
        if (sum == -3) {
            finish();
            labelWinner.setText("Winner O");
        }

    }

    public void winner() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            check(sum);
            sum = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            check(sum);
            sum = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        check(sum);
        sum = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            sum += arr[i][j];
        }
        check(sum);
    }

    public void button00Click(ActionEvent e) {
        if (flag) {
            button00.setText("X");
            arr[0][0] = 1;
            labelXorO.setText("O");
        } else {
            button00.setText("0");
            arr[0][0] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button00.setDisable(true);
    }

    public void button01Click(ActionEvent e) {
        if (flag) {
            button01.setText("X");
            arr[0][1] = 1;
            labelXorO.setText("O");
        } else {
            button01.setText("0");
            arr[0][1] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button01.setDisable(true);
    }

    public void button02Click(ActionEvent e) {
        if (flag) {
            button02.setText("X");
            arr[0][2] = 1;
            labelXorO.setText("O");
        } else {
            button02.setText("0");
            arr[0][2] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button02.setDisable(true);
    }

    public void button10Click(ActionEvent e) {
        if (flag) {
            button10.setText("X");
            arr[1][0] = 1;
            labelXorO.setText("O");
        } else {
            button10.setText("0");
            arr[1][0] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button10.setDisable(true);
    }

    public void button11Click(ActionEvent e) {
        if (flag) {
            button11.setText("X");
            arr[1][1] = 1;
            labelXorO.setText("O");
        } else {
            button11.setText("0");
            arr[1][1] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button11.setDisable(true);
    }

    public void button12Click(ActionEvent e) {
        if (flag) {
            button12.setText("X");
            arr[1][2] = 1;
            labelXorO.setText("O");
        } else {
            button12.setText("0");
            arr[1][2] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button12.setDisable(true);
    }
    public void button20Click(ActionEvent e) {
        if (flag) {
            button20.setText("X");
            arr[2][0] = 1;
            labelXorO.setText("O");
        } else {
            button20.setText("0");
            arr[2][0] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button20.setDisable(true);
    }
    public void button21Click(ActionEvent e) {
        if (flag) {
            button21.setText("X");
            arr[2][1] = 1;
            labelXorO.setText("O");
        } else {
            button21.setText("0");
            arr[2][1] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button21.setDisable(true);
    }
    public void button22Click(ActionEvent e) {
        if (flag) {
            button22.setText("X");
            arr[2][2] = 1;
            labelXorO.setText("O");
        } else {
            button22.setText("0");
            arr[2][2] = -1;
            labelXorO.setText("X");
        }
        winner();
        flag = !flag;
        button22.setDisable(true);
    }
}
