package com.wilis.array2;

public class almag {
	private String nama="";
	private String alamat="";
	private String jekel="";
	
	
	public String getNama() {
		return(nama);
	}
	
	public void setNama(String nama) {
		this.nama=nama;
	}
	
	public String getAlamat() {
		return(alamat);
	}
	
	public void setAlamat(String alamat) {
		this.alamat=alamat;
	}
	
	public String getJekel() {
		return(jekel);
	}
	
	public void setJekel(String jekel) {
		this.jekel=jekel;
	}
	
	public String toString() {
		return(getNama());
	}
}
