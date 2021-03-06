package com.madcamp.yourdaily;

import java.util.List;

public class Profile {
    private String email;
    private String nick;
    private String profileImage;

    public Profile() {
    }

    public Profile(String email, List<String> friendEmails, String nick, String profileImage) {
        this.email = email;
        this.nick = nick;
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
