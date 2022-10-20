package Discord;

import fr.chovy.freeboxos.website.WebsiteApplication;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;


public class EventDisc implements EventListener {
    private boolean yoni = false;
public EventDisc(){
    System.out.println(("ceci est un test afin de verifier le nb d'instance de listener__________________________________"));
}


    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof MessageReceivedEvent)
            if (!((MessageReceivedEvent) event).getMessage().getAuthor().isBot()){
                if (((MessageReceivedEvent)event).getMessage().getContentDisplay().toLowerCase().contains("bon")){
                    try{
                        ((MessageReceivedEvent) event).getChannel().deleteMessageById(((MessageReceivedEvent) event).getMessage().getId()).queue();
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if (((MessageReceivedEvent)event).getMessage().getAuthor().getId().equals("251826463588745216") && yoni){
                    try{
                        ((MessageReceivedEvent) event).getChannel().deleteMessageById(((MessageReceivedEvent) event).getMessage().getId()).queue();
                        WebsiteApplication.bot.sendMsg("sate sate sate yoni kun qui a autorisé le prolétaire que tu es à écrire ","812813246499127296","812813246499127299");
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                if (((MessageReceivedEvent)event).getMessage().getContentDisplay().equals("!yoni")){
                    this.yoni= !yoni;
                    WebsiteApplication.bot.sendMsg("est ce que yoni peux écrire : "+yoni ,"812813246499127296","812813246499127299");
                    }
                }
            }

    }

