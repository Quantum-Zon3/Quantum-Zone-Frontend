package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import vista.InicioSecion;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
			InicioSecion ini = new InicioSecion();
			ini.setVisible(true);
		
	}

}
