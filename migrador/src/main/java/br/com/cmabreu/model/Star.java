package br.com.cmabreu.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "athyg_stars")
public class Star implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tb_stars_id_star_seq")
	@SequenceGenerator(name = "id_star", sequenceName = "tb_stars_id_star_seq", allocationSize = 1)	
	@Column Long idStar;
	@Column String tyc;
	@Column String gaia;
	@Column String hyg;
	@Column String hip;
	@Column String hd;
	@Column String hr;
	@Column String gl;
	@Column String bayer;
	@Column String flam;
	@Column String con;
	@Column String proper;
	@Column String pos_src;
	@Column String dist_src;
	@Column String mag_src;
	@Column String pm_src;
	@Column String rv_src;
	@Column Double ra;
	@Column Double decl;
	@Column Double dist;
	@Column Double x0;
	@Column Double y0;
	@Column Double z0;
	@Column Double mag;
	@Column Double absmag;
	@Column Double rv;
	@Column Double pm_ra;
	@Column Double pm_dec;
	@Column Double vx;
	@Column Double vy;
	@Column Double vz;
	public Long getId() {
		return idStar;
	}
	public void setId(Long id) {
		this.idStar = id;
	}
	public String getTyc() {
		return tyc;
	}
	public void setTyc(String tyc) {
		this.tyc = tyc;
	}
	public String getGaia() {
		return gaia;
	}
	public void setGaia(String gaia) {
		this.gaia = gaia;
	}
	public String getHyg() {
		return hyg;
	}
	public void setHyg(String hyg) {
		this.hyg = hyg;
	}
	public String getHip() {
		return hip;
	}
	public void setHip(String hip) {
		this.hip = hip;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public String getHr() {
		return hr;
	}
	public void setHr(String hr) {
		this.hr = hr;
	}
	public String getGl() {
		return gl;
	}
	public void setGl(String gl) {
		this.gl = gl;
	}
	public String getBayer() {
		return bayer;
	}
	public void setBayer(String bayer) {
		this.bayer = bayer;
	}
	public String getFlam() {
		return flam;
	}
	public void setFlam(String flam) {
		this.flam = flam;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getProper() {
		return proper;
	}
	public void setProper(String proper) {
		this.proper = proper;
	}
	public String getPos_src() {
		return pos_src;
	}
	public void setPos_src(String pos_src) {
		this.pos_src = pos_src;
	}
	public String getDist_src() {
		return dist_src;
	}
	public void setDist_src(String dist_src) {
		this.dist_src = dist_src;
	}
	public String getMag_src() {
		return mag_src;
	}
	public void setMag_src(String mag_src) {
		this.mag_src = mag_src;
	}
	public String getPm_src() {
		return pm_src;
	}
	public void setPm_src(String pm_src) {
		this.pm_src = pm_src;
	}
	public String getRv_src() {
		return rv_src;
	}
	public void setRv_src(String rv_src) {
		this.rv_src = rv_src;
	}
	public Double getRa() {
		return ra;
	}
	public void setRa(Double ra) {
		this.ra = ra;
	}
	public Double getDecl() {
		return decl;
	}
	public void setDecl(Double decl) {
		this.decl = decl;
	}
	public Double getDist() {
		return dist;
	}
	public void setDist(Double dist) {
		this.dist = dist;
	}
	public Double getX0() {
		return x0;
	}
	public void setX0(Double x0) {
		this.x0 = x0;
	}
	public Double getY0() {
		return y0;
	}
	public void setY0(Double y0) {
		this.y0 = y0;
	}
	public Double getZ0() {
		return z0;
	}
	public void setZ0(Double z0) {
		this.z0 = z0;
	}
	public Double getMag() {
		return mag;
	}
	public void setMag(Double mag) {
		this.mag = mag;
	}
	public Double getAbsmag() {
		return absmag;
	}
	public void setAbsmag(Double absmag) {
		this.absmag = absmag;
	}
	public Double getRv() {
		return rv;
	}
	public void setRv(Double rv) {
		this.rv = rv;
	}
	public Double getPm_ra() {
		return pm_ra;
	}
	public void setPm_ra(Double pm_ra) {
		this.pm_ra = pm_ra;
	}
	public Double getPm_dec() {
		return pm_dec;
	}
	public void setPm_dec(Double pm_dec) {
		this.pm_dec = pm_dec;
	}
	public Double getVx() {
		return vx;
	}
	public void setVx(Double vx) {
		this.vx = vx;
	}
	public Double getVy() {
		return vy;
	}
	public void setVy(Double vy) {
		this.vy = vy;
	}
	public Double getVz() {
		return vz;
	}
	public void setVz(Double vz) {
		this.vz = vz;
	} 	
	
}