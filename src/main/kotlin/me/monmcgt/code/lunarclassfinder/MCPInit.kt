package me.monmcgt.code.lunarclassfinder

import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipInputStream

object MCPInit {
    val link = URL("http://www.modcoderpack.com/files/mcp918.zip")
    val path = "conf/joined.srg"

    @JvmStatic
    fun main(args: Array<String>) {
        val httpURLConnection = link.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        // download (in memory) as zip then find the joined.srg file
        val zip = ZipInputStream(httpURLConnection.inputStream)
        var entry = zip.nextEntry
        while (entry != null) {
            if (entry.name == path) {
                // found the joined.srg file
                // read it into a string
                val joinedSrg = zip.bufferedReader().readText()
                // parse the joined.srg file
                val out = File("./file/mcp.txt")
                out.parentFile.mkdirs()
                out.createNewFile()
                out.writeText(joinedSrg)
                // done
                return
            }
            entry = zip.nextEntry
        }
    }
}