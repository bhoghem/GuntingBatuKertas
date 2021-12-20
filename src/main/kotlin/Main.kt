fun main() {
    println("==============================")
    println("Aplikasi Gunting, Batu, Kertas")
    println("==============================")

println("1.Pemain Satu Pilih:")
    var pemainSatu = readLine()
    println("2.Pemain Dua Pilih:")
    var pemainDua = readLine()
    var status = false

    if (pemainDua!!.toLowerCase().equals(pemainSatu?.toLowerCase())) {
        println("Seri $pemainSatu dengan $pemainDua")
    }
    else if (pemainDua.toLowerCase().equals("batu")) {
        if(pemainSatu?.toLowerCase().equals("gunting")){
            status = true
            hasil(status,pemainDua,pemainSatu)
        }else{
            status = false
            hasil(status,pemainDua,pemainSatu)
        }
    }
    else if (pemainDua.toLowerCase().equals("gunting")) {
        if (pemainSatu?.toLowerCase().equals("kertas")) {
            status = true
            hasil(status,pemainDua,pemainSatu)
        } else {
            status = false
            hasil(status,pemainDua,pemainSatu)
        }
    }
    else if (pemainDua.toLowerCase().equals("kertas")) {
        if (pemainSatu?.toLowerCase().equals("batu")) {
            status = true
            hasil(status,pemainDua,pemainSatu)
        } else {
            status = false
            hasil(status,pemainDua,pemainSatu)
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String?) {
    if (status) {
        println("yah Kamu Kalah Pemain Satu!! $p1 mengalahkan $p2, Selamat Pemain Dua")
    } else {
        println("Hore Kamu Menang pemain Satu!! $p2 mengalahkan $p1, Semangat Pemain Dua!!")

    }
}
