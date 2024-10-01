package Composite

class Directory(private val name: String): FileSystemComponent {
    private val children = mutableListOf<FileSystemComponent>()

    fun addComponent(component: FileSystemComponent) {
        children.add(component)
    }

    override fun showDetails(identation: String) {
        println("$identation +  Directory: $name")
        for (component in children) {
            component.showDetails("$identation ")
        }
    }
}