import android.content.Context

/**
 * Name: Alex Oladele
 * Unique ID: Oladelaa
 * Date: 12/18/17
 * Project: Slayd
 */
class SharedPrefsManager(context: Context) {
    //    ======================== MEMBER VARIABLES ========================
    private val sharedPrefsHelper: SharedPrefsStore = SharedPrefsStore(context)

    //    ======================== INTERFACE OVERRIDE METHODS ========================

    //    ======================== USER METHODS ========================
    fun clear() {
        sharedPrefsHelper.clear()
    }

    /* fun setEmailID(email: String) {
         sharedPrefsHelper.putEmail(email)
     }

     fun getEmailID(): String {
         return sharedPrefsHelper.getEmail()
     }*/

}