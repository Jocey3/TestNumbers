package dev.jocey.testnumbers.model.retrofit;

import com.google.gson.annotations.SerializedName;

public class Entity {
    @SerializedName("found")
    private Boolean isFound;
    @SerializedName("number")
    private Integer number;
    @SerializedName("text")
    private String text;
    @SerializedName("type")
    private String type;

    public Boolean getFound() {
        return isFound;
    }

    private void setFound(Boolean found) {
        isFound = found;
    }

    public Integer getNumber() {
        return number;
    }

    private void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
}
