package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class MyQueryTypeError {

	@JsonDeserialize(as = CharacterImpl.class)
	Character error;

	public void setError(Character error) {
		this.error = error;
	}

	public Character getError() {
		return error;
	}
	
    public String toString() {
        return "MyQueryTypeError {error: " + error + "}";
    }
}