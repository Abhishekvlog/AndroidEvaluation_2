package com.example.androidevaluation_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.androidevaluation_2.R
import com.example.androidevaluation_2.model.room.ProfileDAO
import com.example.androidevaluation_2.model.room.ProfileDatabase
import com.example.androidevaluation_2.model.room.ProfileEntity
import com.example.androidevaluation_2.repository.Repository
import com.example.androidevaluation_2.viewmodel.ViewModel
import com.example.androidevaluation_2.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  database: ProfileDatabase
    lateinit var  dao: ProfileDAO
    lateinit var repository: Repository
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = ProfileDatabase.getprofileDatabase(this).getProfileDao()

        repository = Repository(dao)

        val viewModelFactory = ViewModelFactory(repository)

        val viewmodel = ViewModelProviders.of(this,viewModelFactory)
            .get(ViewModel::class.java)







    }

}