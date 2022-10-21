package Discord;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "bot")
@Scope("singleton")
public  class Bot {
private JDA jda;
public Bot(String token) {
try{
    this.jda= JDABuilder.createDefault(token).addEventListeners(new EventDisc()).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
    this.jda.awaitReady();
}catch (Exception ex){}
}

    public void sendMsg(String test ,String guildId,String channelId) {
        TextChannel textChannel = this.jda.getGuildById(guildId).getTextChannelById(channelId);
        if(textChannel.canTalk()) {
            textChannel.sendMessage(test).queue();
        }
    }


}