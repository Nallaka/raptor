package me.nallaka.inixbot.commands.admin

import me.nallaka.inixbot.handlers.CommandHandler
import me.nallaka.inixbot.utils.Consts
import me.nallaka.inixbot.utils.commandmeta.Command
import me.nallaka.inixbot.utils.commandmeta.ICommand
import me.nallaka.inixbot.utils.permissionmeta.PermissionLevel

@ICommand(
        name = "Change Prefix",
        emoji = ":gear:",
        description = "Changes the command prefix",
        usage = "changeprefix <prefix>",
        aliases = [""],
        commandPermissionLevel = PermissionLevel.ADMIN,
        isOwnerOnly = false
)
class ChangePrefixCommand : Command() {
    override fun runCommand(args: Array<String>, commandContainer: CommandHandler.CommandContainer) {
        val cmdProperties = getCmdProperties()
        if (args.isNotEmpty()) {
            Consts.USER_COMMAND_PREFIX = args[0]
            println(Consts.USER_COMMAND_PREFIX)
            embeddedMessageBuilder.addField("${cmdProperties?.name}", "Changed to ``" + args[0] + "``", true)
        } else if (!args.isNotEmpty()) {
            embeddedMessageBuilder.addField("ERROR :no_entry:", "Input a New Header", true)
        }
        commandMessageHandler.sendMessage(commandContainer.event, embeddedMessageBuilder)
    }
}