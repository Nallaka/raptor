package me.nallaka.inixbot.listeners

import me.nallaka.inixbot.handlers.CommandHandler
import me.nallaka.inixbot.utils.Consts
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {
    private var commandHandler = CommandHandler()

    //Runs on MessageRecieved Event. Checks type of command and executes
    override fun onMessageReceived(event: MessageReceivedEvent) {
        val content = event.message.content.toLowerCase()
        if (content.startsWith(Consts.DEFAULT_COMMAND_PREFIX) || content.toLowerCase().startsWith(Consts.USER_COMMAND_PREFIX)) {
            commandHandler.executeCommand(commandHandler.parseCommand(event))
        }
    }
}