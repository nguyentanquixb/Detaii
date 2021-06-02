package com.web.entities;

import java.util.Date;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "action")
public class Action {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_hoatdong;
	private String noidung;
	private Date ngaybatdau;
	private Date ngaytao;
	private String tenhoatdong;
	@OneToMany(mappedBy = "hoatdong")
	private Set<RegistrationList> listDanhsach;

	/**
	 * @return the listDanhsach
	 */
	public Set<RegistrationList> getListDanhsach() {
		return listDanhsach;
	}

	/**
	 * @param listDanhsach the listDanhsach to set
	 */
	public void setListDanhsach(Set<RegistrationList> listDanhsach) {
		this.listDanhsach = listDanhsach;
	}

	/**
	 * @return the tenhoatdong
	 */
	public String getTenhoatdong() {
		return tenhoatdong;
	}

	/**
	 * @param tenhoatdong the tenhoatdong to set
	 */
	public void setTenhoatdong(String tenhoatdong) {
		this.tenhoatdong = tenhoatdong;
	}

	/**
	 * @return the id_hoatdong
	 */
	public int getId_hoatdong() {
		return id_hoatdong;
	}

	/**
	 * @param id_hoatdong the id_hoatdong to set
	 */
	public void setId_hoatdong(int id_hoatdong) {
		this.id_hoatdong = id_hoatdong;
	}

	/**
	 * @return the noidung
	 */
	public String getNoidung() {
		return noidung;
	}

	/**
	 * @param noidung the noidung to set
	 */
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	/**
	 * @return the ngaybatdau
	 */
	public Date getNgaybatdau() {
		return ngaybatdau;
	}

	/**
	 * @param ngaybatdau the ngaybatdau to set
	 */
	public void setNgaybatdau(Date ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	/**
	 * @return the ngaytao
	 */
	public Date getNgaytao() {
		return ngaytao;
	}

	/**
	 * @param ngaytao the ngaytao to set
	 */
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

}
