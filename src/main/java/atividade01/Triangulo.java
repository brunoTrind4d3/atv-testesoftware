package atividade01;

import atividade01.interfaces.TriangulITF;

public class Triangulo implements TriangulITF {
	
	private int x;
	private int y;
	private int z;


	public Triangulo(int lado1, int lado2, int lado3) {
		this.x = lado1;
		this.y = lado2;
		this.z = lado3;
	}
	
	public boolean isTriangulo() {
		if ((x < y + z) && (y < x + z) && (z < x+y)){
			return true;
		}
		return false;
	}

	public boolean isTrianguloEscaleno() {
		if((x!= y && x!= z && y!=z) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloEquilatero() {
		if((x == y && x == z) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloIsoceles() {
		if(((x == y) || (x == z)) && this.isTriangulo()) return true;
		return false;
	}

}
