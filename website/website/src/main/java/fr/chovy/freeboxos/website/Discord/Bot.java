package fr.chovy.freeboxos.website.Discord;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public  class Bot {
private String token ="NTgzOTk2MjU0ODYyNzA0NjUw.GTxWrJ.rwbJgx3CX_bZdszuDjKU-pyYvovlfCLHw8jdZs";
private JDABuilder build=JDABuilder.createDefault(token);
private JDA jda;
public Bot() {
try{
    this.jda=build.build();
    this.jda.awaitReady();

}catch (Exception ex){}
}

    public void sendMsg(String test) {
        TextChannel textChannel = this.jda.getGuildById("954877593197350964").getTextChannelById("954877593713266731");
        if(textChannel.canTalk()) {
            textChannel.sendMessage(test).queue();
        }
    }
}