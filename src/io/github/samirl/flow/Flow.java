package io.github.samirl.flow;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Flow extends JFrame {
	private JLabel statusbar;
	public Flow() {
		init();
	}
	private void init() {
		doMenu();
		ImageIcon icon = new ImageIcon("icon.png");
		setIconImage(icon.getImage());
		setTitle("Go With The Flow - Debate Flowing Software");
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void doMenu() {
		statusbar = new JLabel("Go With The Flow v0.0.1-SNAPSHOT: LD Edition | Ready");
		statusbar.setBorder(BorderFactory.createEtchedBorder());
		add(statusbar, BorderLayout.SOUTH);
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu save = new JMenu("Save");
		JMenuItem newFile = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem doc = new JMenuItem("Save as .doc");
		JMenuItem pdf = new JMenuItem("Save as .pdf");
		JMenuItem rtf = new JMenuItem("Save as .rtf");
		JMenuItem quit = new JMenuItem("Quit");
		quit.addActionListener((ActionEvent e) -> {
			System.exit(0);
		});
		save.add(doc);
		save.add(pdf);
		save.add(rtf);
		file.add(newFile);
		file.add(open);
		file.addSeparator();
		file.add(save);
		file.addSeparator();
		file.add(quit);
		JMenu edit = new JMenu("Edit");
		JMenuItem bold = new JMenuItem("Bold");
		JMenuItem italic = new JMenuItem("Italic");
		JMenuItem underline = new JMenuItem("Underline");
		edit.add(bold);
		edit.add(italic);
		edit.add(underline);
		JMenu flow = new JMenu("Flow");
		JMenuItem framing = new JMenu("Add Framing");
		JMenuItem value = new JMenu("Add Value");
		JMenuItem criterion = new JMenu("Add Criterion");
		criterion.setToolTipText("Also known as the standard");
		JMenuItem contention = new JMenu("Add Contention");
		bar.add(file);
		bar.add(edit);
		bar.add(flow);
		setJMenuBar(bar);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Flow flow = new Flow();
			flow.setVisible(true);
		});
	}
}
