package de.kottilabs.todobackend.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import de.kottilabs.todobackend.dao.TodoState;
import lombok.Data;

import java.util.UUID;

@Data
public class TodoRequest {

	@NotNull
	private String name;

	@NotNull
	private TodoState state;

	@NotNull(groups = Update.class)
	private UUID scopeId;

	@NotNull
	private String description;

	private String icon;

	public interface Create {
	}

	public interface Update {
	}
}
