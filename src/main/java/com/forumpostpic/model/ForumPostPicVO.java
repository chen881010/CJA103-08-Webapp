package com.forumpostpic.model;

import java.io.Serializable;

public class ForumPostPicVO implements Serializable{
	
	private Integer picId;
	private Integer postId;
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
