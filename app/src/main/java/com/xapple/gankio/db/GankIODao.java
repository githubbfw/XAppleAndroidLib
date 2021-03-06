package com.xapple.gankio.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.xapple.gankio.data.model.GankIO;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GANK_IO".
*/
public class GankIODao extends AbstractDao<GankIO, String> {

    public static final String TABLENAME = "GANK_IO";

    /**
     * Properties of entity GankIO.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "_ID");
        public final static Property CreatedAt = new Property(1, String.class, "createdAt", false, "CREATED_AT");
        public final static Property Desc = new Property(2, String.class, "desc", false, "DESC");
        public final static Property PublishedAt = new Property(3, String.class, "publishedAt", false, "PUBLISHED_AT");
        public final static Property Source = new Property(4, String.class, "source", false, "SOURCE");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
        public final static Property Url = new Property(6, String.class, "url", false, "URL");
        public final static Property Used = new Property(7, boolean.class, "used", false, "USED");
        public final static Property Who = new Property(8, String.class, "who", false, "WHO");
    }


    public GankIODao(DaoConfig config) {
        super(config);
    }
    
    public GankIODao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GANK_IO\" (" + //
                "\"_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: _id
                "\"CREATED_AT\" TEXT NOT NULL ," + // 1: createdAt
                "\"DESC\" TEXT NOT NULL ," + // 2: desc
                "\"PUBLISHED_AT\" TEXT," + // 3: publishedAt
                "\"SOURCE\" TEXT NOT NULL ," + // 4: source
                "\"TYPE\" TEXT NOT NULL ," + // 5: type
                "\"URL\" TEXT NOT NULL ," + // 6: url
                "\"USED\" INTEGER NOT NULL ," + // 7: used
                "\"WHO\" TEXT NOT NULL );"); // 8: who
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GANK_IO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GankIO entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
        stmt.bindString(2, entity.getCreatedAt());
        stmt.bindString(3, entity.getDesc());
 
        String publishedAt = entity.getPublishedAt();
        if (publishedAt != null) {
            stmt.bindString(4, publishedAt);
        }
        stmt.bindString(5, entity.getSource());
        stmt.bindString(6, entity.getType());
        stmt.bindString(7, entity.getUrl());
        stmt.bindLong(8, entity.getUsed() ? 1L: 0L);
        stmt.bindString(9, entity.getWho());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GankIO entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
        stmt.bindString(2, entity.getCreatedAt());
        stmt.bindString(3, entity.getDesc());
 
        String publishedAt = entity.getPublishedAt();
        if (publishedAt != null) {
            stmt.bindString(4, publishedAt);
        }
        stmt.bindString(5, entity.getSource());
        stmt.bindString(6, entity.getType());
        stmt.bindString(7, entity.getUrl());
        stmt.bindLong(8, entity.getUsed() ? 1L: 0L);
        stmt.bindString(9, entity.getWho());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public GankIO readEntity(Cursor cursor, int offset) {
        GankIO entity = new GankIO( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // _id
            cursor.getString(offset + 1), // createdAt
            cursor.getString(offset + 2), // desc
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // publishedAt
            cursor.getString(offset + 4), // source
            cursor.getString(offset + 5), // type
            cursor.getString(offset + 6), // url
            cursor.getShort(offset + 7) != 0, // used
            cursor.getString(offset + 8) // who
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GankIO entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setCreatedAt(cursor.getString(offset + 1));
        entity.setDesc(cursor.getString(offset + 2));
        entity.setPublishedAt(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSource(cursor.getString(offset + 4));
        entity.setType(cursor.getString(offset + 5));
        entity.setUrl(cursor.getString(offset + 6));
        entity.setUsed(cursor.getShort(offset + 7) != 0);
        entity.setWho(cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(GankIO entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(GankIO entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GankIO entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
