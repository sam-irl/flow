package io.github.samirl.flow;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Flow extends JFrame {
	public Flow() {
		init();
	}
	private void init() {
		doMenu();
		ImageIcon icon = new ImageIcon("icon.png");
		setIconImage(icon.getImage());
		setTitle("Go With The Flow - Debate Flowing Software");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void doMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu save = new JMenu("Save");
		JMenuItem newFile = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem doc = new JMenuItem("Save as .doc");
		JMenuItem pdf = new JMenuItem("Save as .pdf");
		JMenuItem rtf = new JMenuItem("Save as .rtf");
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Flow flow = new Flow();
			flow.setVisible(true);
		});
	}
}
