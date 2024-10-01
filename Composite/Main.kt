package Composite

fun main() {
    val file1 = File("file1.txt")
    val file2 = File("file2.txt")
    val file3 = File("file3.txt")

    val directory1 = Directory("dir1")
    val directory2 = Directory("dir2")

    directory1.addComponent(file1)
    directory1.addComponent(file2)

    val subDirectory = Directory("subDir1")
    subDirectory.addComponent(file3)

    directory1.addComponent(subDirectory)

    directory2.addComponent(directory1)

    directory2.showDetails()
}
