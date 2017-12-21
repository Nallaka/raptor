package me.nallaka.inixbot.meta.commandmeta

class CommandRegistry {
    //Initialize CommandRegistry
    private var commandRegistry: MutableMap<String, Command> = mutableMapOf()

    //Adds new command to registry with name "commandString" and Command "command"
    fun setCommand(commandString: String, command: Command) = commandRegistry.put(commandString, command)

    //Gets command with Key "commandString"
    fun getCommand(commandString: String ) : Command? = commandRegistry[commandString]

    //Checks if commandRegistry contains Key "key"
    fun registryContainsKey(key: String) : Boolean = commandRegistry.containsKey(key)

    //Returns complete commandRegistry
    fun getCommandRegistry() : MutableMap<String, Command> = commandRegistry

    //Sets commandRegistry with original Commands
    fun setCommendRegistry() {

    }

}