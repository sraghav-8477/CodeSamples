package org.santhosh.actuate.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.santhosh.actuate.messenger.database.DatabaseClass;
import org.santhosh.actuate.messenger.model.Comment;
import org.santhosh.actuate.messenger.model.Message;

public class CommentService {
	private Map<Long,Message> messages = DatabaseClass.getAllMessages();
	
	public CommentService() {
		//Map<Long,Comment> comments = messages.get(1L).getComments();
		//comments.put(1L, new Comment(1L,"this is first test comment","Santhosh"));
		//comments.put(2L, new Comment(2L,"this is Second test comment","Sarika"));
	}

	public List<Comment> getAllComments(long messageId){
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	
	public Comment getComment(long messageId,long commentId) {
		
		return messages.get(messageId).getComments().get(commentId);
	}
	
	public Comment addComment(long messageId, Comment comment) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size()+1);
		comments.put(comment.getId(), comment);
		messages.get(messageId).setComments(comments);
		return messages.get(messageId).getComments().get(comment.getId());
	}
	
	public Comment updateComment(long messageId, Comment comment) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		if(comment.getId() <=0) {
			return null;
		}
		comments.put(comment.getId(), comment);
		messages.get(messageId).setComments(comments);
		return messages.get(messageId).getComments().get(comment.getId());
	}
	
	public Comment removeComment(long messageId, long commentId) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		Comment removedComment = messages.get(messageId).getComments().get(commentId);
		comments.remove(commentId);
		messages.get(messageId).setComments(comments);
		return removedComment;
	}
}
