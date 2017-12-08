package edna.ceniza.com.recipelist2

import android.os.Parcel
import android.os.Parcelable
/**
 * Created by Edna Ceniza on 07/12/2017.
 */
data class Food  (val name: String,
                  val desc: String,
                  val img: Int = 0,
                  val ingred: String,
                  val proced: String
                  ):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString()) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(desc)
        parcel.writeInt(img)
        parcel.writeString(ingred)
        parcel.writeString(proced)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }
    }
}

