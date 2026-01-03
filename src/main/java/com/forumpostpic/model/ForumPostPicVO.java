package com.forumpostpic.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forumpostpicture")
public class ForumPostPicVO implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PIC_ID", updatable = false)
	private Integer picId;
	
	@Column(name = "POST_ID", updatable = false)
	private Integer postId;
	
	@Column(name = "PIC", columnDefinition = "longblob")
	private byte[] pic;
	
	public ForumPostPicVO() {
		super();
	}

	public ForumPostPicVO(Integer picId, Integer postId, byte[] pic) {
		super();
		this.picId = picId;
		this.postId = postId;
		this.pic = pic;
	}

	public Integer getPicId() {
		return picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	
}
