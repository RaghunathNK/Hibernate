package com.ty.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
//import javax.persistence.Table;

@Entity
//@Table(name="Songs")
public class Song 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="songname")
	private String songname;
	private String artist;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getSongname()
	{
		return songname;
	}
	public void setSongname(String songname) 
	{
		this.songname = songname;
	}
	public String getArtist()
	{
		return artist;
	}
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	@Override
	public String toString()
	{
		return "Song [id=" + id + ", songname=" + songname + ", artist=" + artist + "]";
	}
}
