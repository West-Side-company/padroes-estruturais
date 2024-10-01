package Composite

class File(private val name: String): FileSystemComponent {
    override fun showDetails(identation: String) {
        println("$identation - File: $name")
    }
}