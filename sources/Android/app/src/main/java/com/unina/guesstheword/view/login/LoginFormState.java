package com.unina.guesstheword.view.login;

import androidx.annotation.Nullable;

/**
 * Data validation state of the login form.
 */
class LoginFormState {
    @Nullable
    private final Integer emailError;
    @Nullable
    private final Integer passwordError;
    private final boolean isDataValid;

    LoginFormState(@Nullable Integer emailError, @Nullable Integer passwordError) {
        this.emailError = emailError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }

    LoginFormState(boolean isDataValid) {
        this.emailError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }

    @Nullable
    Integer getEmailError() {
        return emailError;
    }

    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    boolean isDataValid() {
        return isDataValid;
    }
}