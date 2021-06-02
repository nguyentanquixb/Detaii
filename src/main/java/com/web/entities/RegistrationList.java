package com.web.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registrationlist")
public class RegistrationList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String msv;
	private String dangky;
	private Date timedangky;
	private Date timehuydangky;
	@ManyToOne
	@JoinColumn(name = "id_hoatdong")
	private Action hoatdong;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the msv
	 */
	public String getMsv() {
		return msv;
	}

	/**
	 * @param msv the msv to set
	 */
	public void setMsv(String msv) {
		this.msv = msv;
	}

	/**
	 * @return the dangky
	 */
	public String getDangky() {
		return dangky;
	}

	/**
	 * @param dangky the dangky to set
	 */
	public void setDangky(String dangky) {
		this.dangky = dangky;
	}

	/**
	 * @return the timedangky
	 */
	public Date getTimedangky() {
		return timedangky;
	}

	/**
	 * @param timedangky the timedangky to set
	 */
	public void setTimedangky(Date timedangky) {
		this.timedangky = timedangky;
	}

	/**
	 * @return the timehuydangky
	 */
	public Date getTimehuydangky() {
		return timehuydangky;
	}

	/**
	 * @param timehuydangky the timehuydangky to set
	 */
	public void setTimehuydangky(Date timehuydangky) {
		this.timehuydangky = timehuydangky;
	}

	/**
	 * @return the hoatdong
	 */
	public Action getHoatdong() {
		return hoatdong;
	}

	/**
	 * @param hoatdong the hoatdong to set
	 */
	public void setHoatdong(Action hoatdong) {
		this.hoatdong = hoatdong;
	}
}
