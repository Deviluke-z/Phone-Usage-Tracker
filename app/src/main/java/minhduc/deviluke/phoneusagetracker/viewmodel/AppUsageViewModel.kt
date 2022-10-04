package minhduc.deviluke.phoneusagetracker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import minhduc.deviluke.phoneusagetracker.model.App

class AppUsageViewModel(application: Application): AndroidViewModel(application) {

    val listApp = MutableList<List<App>>()


}