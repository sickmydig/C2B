package net.dontdrinkandroot.example.angularrestspringsecurity.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.joyaether.datastore.schema.Identity;
import com.joyaether.datastore.schema.Model;

/**
 * Created by lampt on 12/22/14.
 */
public class News extends Model<News, Long> implements Identity<Long> {
    public static final String ID_FIELD_NAME = "id";
    public static final String CONTENT_FIELD_NAME = "content";

    public News() {
    }

    @DatabaseField(
            columnName = ID_FIELD_NAME,
            canBeNull = false,
            id=true,
            indexName= "PK_news_entry_id")
    @SerializedName(ID_FIELD_NAME)
    @Expose
    private Long id;

    @DatabaseField(
            columnName = CONTENT_FIELD_NAME,
            canBeNull = false)
    @SerializedName(CONTENT_FIELD_NAME)
    @Expose
    private String content;

    @Override
    public Long getIdentity() {
        return id;
    }

    @Override
    public String getIdentityAttribute() {
        return ID_FIELD_NAME;
    }
}
