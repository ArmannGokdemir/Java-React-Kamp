package day5Assignment.core.abstracts;

import day5Assignment.entities.abstracts.User;

public interface ValidityCheck {
	boolean isAllFieldsFilled(User user);
	boolean isFirstNameValid(User user);
	boolean isLastNameValid(User user);
	boolean isPasswordValid(User user);
	boolean isMailValid(User user);
	boolean isPersonValid(User user);
}
