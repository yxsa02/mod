package com.yxs.mod;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
//import static net.minecraft.server.command.CommandManager.*;
//import static net.minecraft.server.command.CommandManager.literal;

public class Command {
    public static void register() {
        // 注册命令
        /*
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(literal("fym").executes(context -> {
                context.getSource().sendFeedback(Text.literal("Hello, World!"), false);
                return 1;
            })
            );

        });*/
    }
}