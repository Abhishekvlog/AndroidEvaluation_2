package com.example.androidevaluation_2.model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProfileEntity::class],version = 1)
abstract class ProfileDatabase : RoomDatabase() {

    abstract fun getProfileDao() : ProfileDAO

    companion object{
        private var INSTANCE : ProfileDatabase? = null

        fun getprofileDatabase(context: Context) : ProfileDatabase{
            if (INSTANCE != null){
                return INSTANCE!!
            }
            else{

                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    ProfileDatabase::class.java,
                    "profiledb"
                )

                builder.fallbackToDestructiveMigration()

                INSTANCE = builder.build()

            }

            return INSTANCE!!

        }
    }
}