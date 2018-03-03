import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.aliciareesealex.squirrelhack.util.SHARED_PREFS_STORE

/**
 * Name: Alex Oladele
 * Unique-ID: OLADELAA
 * Project: NOT Slayd
 */
class SharedPrefsStore(private val context: Context) {
    private var sharedPrefs = context.getSharedPreferences(SHARED_PREFS_STORE, MODE_PRIVATE)

    //    ======================== MEMBER VARIABLES ========================
    companion object {
        val TAG: String = SharedPrefsStore::class.java.name
    }

    //    ======================== METHODS ========================
    fun clear() {
        sharedPrefs.edit().clear().apply()
    }

/*    fun putEmail(email: String) {
        sharedPrefs.edit().putString(USER_EMAIL_KEY, email).apply()
    }

    fun getEmail(): String {
        return sharedPrefs.getString(USER_EMAIL_KEY, null)
    }*/

}