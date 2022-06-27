import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    fun readFile() {// 코틀린에서는 모두 unchecked exception
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFileTryWithResources(path: String) {
        // try with resources -> user 함수를 활용
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}