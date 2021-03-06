package com.peacecorps.malaria.data.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.peacecorps.malaria.data.db.entities.AlarmTime;

@Dao
public interface AlarmDao {
    @Insert
    void insertAlarmData(AlarmTime data);

    @Query("SELECT * FROM alarmtime WHERE id = 1")
    AlarmTime getAlarmData();

    @Query("UPDATE alarmtime SET hour= :hour , minute= :minute")
    void updateTime(int hour, int minute);
}
