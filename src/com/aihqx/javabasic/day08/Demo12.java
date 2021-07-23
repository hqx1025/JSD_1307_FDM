package com.aihqx.javabasic.day08;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo12 {

	/**
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(25 * 10, 25 * 20);
		// JPanel panel = new JPanel();
		MyPanel panel = new MyPanel();
		panel.setBackground(new Color(0x0000ff));
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); // 窗口大小不可改变
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); // "尽快" 调用paint（）
		panel.action(); // 窗口显示出来以后 才能请求键盘输入 焦点

	}

}

class MyPanel extends JPanel {
	Cell c1; // 旺才这个变量名字
	Cell c2;
	Cell c3;
	Cell c4;

	public void action() {
		c1 = new Cell(0, 3, 0xff0000); // 创建对象 旺才 有了具体的狗东西
		c2 = new Cell(0, 4, 0xffff00);
		c3 = new Cell(0, 5, 0xffff00);
		c4 = new Cell(1, 4, 0xffff00);

		repaint();

		// new KeyAdapter(){} 创建匿名内部类
		KeyAdapter l = new KeyAdapter() {
			// key :按键 Pressed:按下完成了
			// 按键按下以后 ，会执行方法
			// KeyEvent e 是一个对象, 包含按键发生时候
			// 时间 地点 人物
			public void keyPressed(KeyEvent e) {
				// long time = e.getWhen();
				// System.out.println("按下:" + e.getKeyCode());
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_RIGHT:
					c1.moveRight();
					c2.moveRight();
					c3.moveRight();
					c4.moveRight();
					break;
				case KeyEvent.VK_LEFT:
					c1.moveLeft();
					c2.moveLeft();
					c3.moveLeft();
					c4.moveLeft();
					break;
				case KeyEvent.VK_UP:
					c1.moveUp();
					c2.moveUp();
					c3.moveUp();
					c4.moveUp();
					break;
				// 重载的方法是根据参数类型调用的
				case KeyEvent.VK_DOWN:
					c1.moveDown();
					c2.moveDown();
					c3.moveDown();
					c4.moveDown();
					break;
				case KeyEvent.VK_SPACE:
					c1.moveDown(17);
					c2.moveDown(17);
					c3.moveDown(17);
					c4.moveDown(17);
					break;

				}
				repaint(); // 尽快调用paint()
				// [->] -> c1.moveRight() -> col++ -> repaint() ->paint() ->根据当前
				// 的 c1.col 绘制界面

			}
		};
		// 绑定 时间处理方法到 当前面板
		requestFocus(); // 为当前面板 请求键盘输入焦点
		addKeyListener(l); // 绑定 l(keyPressed方法) 到当前面板
	}

	/** 修改了JPanel的绘图方法 */
	public void paint(Graphics g) {
		if (c1 == null) {// 如果没有c1 引用的对象 就不绘制对象了
			return;
		}
		// 现填充背景，再绘制方块
		g.setColor(new Color(0xdddddd));
		g.fillRect(0, 0, 25 * 10, 25 * 20);
		// 画方块 c1
		g.setColor(new Color(c1.color));// 设置画笔颜色
		int x = c1.col * 25;
		int y = c1.row * 25;
		g.fillRect(x, y, 25, 25); // 填充矩形区域
		// 画方块 c2
		g.setColor(new Color(c2.color));
		x = c2.col * 25;
		y = c2.row * 25;
		g.fillRect(x, y, 25, 25); // 填充矩形区域

		g.setColor(new Color(c3.color));
		x = c3.col * 25;
		y = c3.row * 25;
		g.fillRect(x, y, 25, 25);

		g.setColor(new Color(c4.color));
		x = c4.col * 25;
		y = c4.row * 25;
		g.fillRect(x, y, 25, 25);
	}
}

class Cell {
	int row; // 行
	int col; // 列
	int color; // 颜色

	public Cell(int row, int col, int color) {
		this.row = row;
		this.col = col;
		this.color = color;
	}

	/** 方法： 向右移动 move： 移动 Right： 右 */
	public void moveRight() {
		col++;
	}

	public void moveLeft() {
		col--;
	}

	public void moveUp() {
		row--;
	}

	// 方法的重载 ： 方法名一样， 方法参数不同， 业务功能类似
	// 业务算法不同 ， 重载的设计是很优雅的

	/** 向下移动一步 */
	public void moveDown() {
		row++;
	}

	/** 向下移动n 步 */
	public void moveDown(int step) {
		row += step;
	}

}
