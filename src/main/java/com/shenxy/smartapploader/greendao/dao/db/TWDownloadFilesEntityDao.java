package com.shenxy.smartapploader.greendao.dao.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.shenxy.smartapploader.greendao.dao.download.TWDownloadFilesEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TWDownloadFiles.
*/
public class TWDownloadFilesEntityDao extends AbstractDao<TWDownloadFilesEntity, Long> {

    public static final String TABLENAME = "TWDownloadFiles";

    /**
     * Properties of entity TWDownloadFilesEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Uri = new Property(1, String.class, "uri", false, "URI");
        public final static Property Alt = new Property(2, String.class, "alt", false, "ALT");
        public final static Property Method = new Property(3, String.class, "method", false, "METHOD");
        public final static Property Mime_type = new Property(4, String.class, "mime_type", false, "MIME_TYPE");
        public final static Property Http_status = new Property(5, Integer.class, "http_status", false, "HTTP_STATUS");
        public final static Property File_status = new Property(6, Integer.class, "file_status", false, "FILE_STATUS");
        public final static Property Start_time = new Property(7, Long.class, "start_time", false, "START_TIME");
        public final static Property Update_time = new Property(8, Long.class, "update_time", false, "UPDATE_TIME");
        public final static Property Length = new Property(9, Long.class, "length", false, "LENGTH");
        public final static Property Current_length = new Property(10, Long.class, "current_length", false, "CURRENT_LENGTH");
        public final static Property File_md5 = new Property(11, String.class, "file_md5", false, "FILE_MD5");
        public final static Property Path = new Property(12, String.class, "path", false, "PATH");
        public final static Property File_full_name = new Property(13, String.class, "file_full_name", false, "FILE_FULL_NAME");
        public final static Property File_name = new Property(14, String.class, "file_name", false, "FILE_NAME");
        public final static Property File_ext_name = new Property(15, String.class, "file_ext_name", false, "FILE_EXT_NAME");
        public final static Property File_uncompressed_path = new Property(16, String.class, "file_uncompressed_path", false, "FILE_UNCOMPRESSED_PATH");
        public final static Property Info = new Property(17, String.class, "info", false, "INFO");
    };


    public TWDownloadFilesEntityDao(DaoConfig config) {
        super(config);
    }
    
    public TWDownloadFilesEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TWDownloadFiles' (" + //
                "'ID' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'URI' TEXT," + // 1: uri
                "'ALT' TEXT," + // 2: alt
                "'METHOD' TEXT," + // 3: method
                "'MIME_TYPE' TEXT," + // 4: mime_type
                "'HTTP_STATUS' INTEGER," + // 5: http_status
                "'FILE_STATUS' INTEGER," + // 6: file_status
                "'START_TIME' INTEGER," + // 7: start_time
                "'UPDATE_TIME' INTEGER," + // 8: update_time
                "'LENGTH' INTEGER," + // 9: length
                "'CURRENT_LENGTH' INTEGER," + // 10: current_length
                "'FILE_MD5' TEXT," + // 11: file_md5
                "'PATH' TEXT," + // 12: path
                "'FILE_FULL_NAME' TEXT," + // 13: file_full_name
                "'FILE_NAME' TEXT," + // 14: file_name
                "'FILE_EXT_NAME' TEXT," + // 15: file_ext_name
                "'FILE_UNCOMPRESSED_PATH' TEXT," + // 16: file_uncompressed_path
                "'INFO' TEXT);"); // 17: info
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TWDownloadFiles'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TWDownloadFilesEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uri = entity.getUri();
        if (uri != null) {
            stmt.bindString(2, uri);
        }
 
        String alt = entity.getAlt();
        if (alt != null) {
            stmt.bindString(3, alt);
        }
 
        String method = entity.getMethod();
        if (method != null) {
            stmt.bindString(4, method);
        }
 
        String mime_type = entity.getMime_type();
        if (mime_type != null) {
            stmt.bindString(5, mime_type);
        }
 
        Integer http_status = entity.getHttp_status();
        if (http_status != null) {
            stmt.bindLong(6, http_status);
        }
 
        Integer file_status = entity.getFile_status();
        if (file_status != null) {
            stmt.bindLong(7, file_status);
        }
 
        Long start_time = entity.getStart_time();
        if (start_time != null) {
            stmt.bindLong(8, start_time);
        }
 
        Long update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindLong(9, update_time);
        }
 
        Long length = entity.getLength();
        if (length != null) {
            stmt.bindLong(10, length);
        }
 
        Long current_length = entity.getCurrent_length();
        if (current_length != null) {
            stmt.bindLong(11, current_length);
        }
 
        String file_md5 = entity.getFile_md5();
        if (file_md5 != null) {
            stmt.bindString(12, file_md5);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(13, path);
        }
 
        String file_full_name = entity.getFile_full_name();
        if (file_full_name != null) {
            stmt.bindString(14, file_full_name);
        }
 
        String file_name = entity.getFile_name();
        if (file_name != null) {
            stmt.bindString(15, file_name);
        }
 
        String file_ext_name = entity.getFile_ext_name();
        if (file_ext_name != null) {
            stmt.bindString(16, file_ext_name);
        }
 
        String file_uncompressed_path = entity.getFile_uncompressed_path();
        if (file_uncompressed_path != null) {
            stmt.bindString(17, file_uncompressed_path);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(18, info);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TWDownloadFilesEntity readEntity(Cursor cursor, int offset) {
        TWDownloadFilesEntity entity = new TWDownloadFilesEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uri
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // alt
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // method
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mime_type
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // http_status
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // file_status
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // start_time
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // update_time
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // length
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // current_length
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // file_md5
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // path
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // file_full_name
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // file_name
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // file_ext_name
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // file_uncompressed_path
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // info
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TWDownloadFilesEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUri(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAlt(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMethod(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMime_type(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHttp_status(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setFile_status(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setStart_time(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setUpdate_time(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setLength(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setCurrent_length(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setFile_md5(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPath(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setFile_full_name(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setFile_name(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setFile_ext_name(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setFile_uncompressed_path(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setInfo(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TWDownloadFilesEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TWDownloadFilesEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}