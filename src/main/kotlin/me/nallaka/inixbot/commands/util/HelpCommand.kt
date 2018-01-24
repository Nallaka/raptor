package me.nallaka.inixbot.commands.util

import me.nallaka.inixbot.handlers.CommandHandler
import me.nallaka.inixbot.utils.commandmeta.Command
import me.nallaka.inixbot.utils.commandmeta.ICommand
import me.nallaka.inixbot.utils.permissionmeta.PermissionLevel
import net.dv8tion.jda.core.EmbedBuilder

@ICommand(
        name = "Help",
        emoji = ":gear:",
        description = "Helps You?",
        usage = "help <command>",
        aliases = ["help"],
        commandPermissionLevel = PermissionLevel.DEFAULT,
        isOwnerOnly = false
)
class HelpCommand : Command() {
    private val embedMessage = EmbedBuilder().setTitle("Help :gear:")
            .setDescription("Do ``_help <command>`` for more information")
            .addField("Admin Commands :red_circle:", "``changeprefix``, ``shutdown``,", true)
            .addField("Fun Commands :boom:", "``coinflip``, ``8ball``, ``hello``, ``rng``,", true)
            .addField("Info Commands :newspaper:", "``bot``, ``user``, ``guild``, ``devinfo``", true)
            .addField("Music Commands :musical_note:", "Coming Soon", true)
            .addField("Utility Commands :tools:", "``search``, ``ping``,", true)

    override fun runCommand(args: Array<String>, commandContainer: CommandHandler.CommandContainer) = sendMessage(commandContainer.event, embedMessage)
}