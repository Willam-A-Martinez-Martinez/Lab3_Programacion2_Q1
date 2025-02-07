/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_Programacion2_Q1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class SudokuGUI {
    private JFrame frame;
    private JTextField[][] cells = new JTextField[9][9];
    private JButton resetButton, solveButton;

    public SudokuGUI() {
        frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        
        JPanel gridPanel = new JPanel(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new JTextField(2);
                cells[i][j].setHorizontalAlignment(JTextField.CENTER);
                gridPanel.add(cells[i][j]);
            }
        }
        
        JPanel buttonPanel = new JPanel();
        resetButton = new JButton("Reiniciar");
        solveButton = new JButton("Resolver");
        
        buttonPanel.add(resetButton);
        buttonPanel.add(solveButton);
        
        frame.add(gridPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SudokuGUI::new);
    }
}

