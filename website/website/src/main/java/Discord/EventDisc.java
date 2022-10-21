package Discord;

import fr.chovy.freeboxos.website.WebsiteApplication;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EventDisc implements EventListener {
    private boolean yoni = true;
    private boolean bonALlowed = true;
    private int count = 0;

    public EventDisc() {
        System.out.println(("ceci est un test afin de verifier le nb d'instance de listener__________________________________"));
    }


    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof MessageReceivedEvent)
            if (!((MessageReceivedEvent) event).getMessage().getAuthor().isBot()) {

                if ((((MessageReceivedEvent) event).getMessage().getContentDisplay()).contains("bon") && !bonALlowed && !(((MessageReceivedEvent) event).getMessage().getContentDisplay()).equals("!bon")) {
                    try {
                        ((MessageReceivedEvent) event).getChannel().deleteMessageById(((MessageReceivedEvent) event).getMessage().getId()).queue();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                if (((MessageReceivedEvent) event).getMessage().getAuthor().equals("251826463588745216") && yoni) {
                    try {
                        ((MessageReceivedEvent) event).getChannel().deleteMessageById(((MessageReceivedEvent) event).getMessage().getId()).queue();
                        if (count == 1)
                            WebsiteApplication.bot.sendMsg("sate sate sate yoni kun qui a autorisé le prolétaire que tu es à écrire ", "812813246499127296", "812813246499127299");
                        count++;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                if (((MessageReceivedEvent) event).getMessage().getContentDisplay().equals("!yoni")) {
                    this.yoni = !yoni;
                    WebsiteApplication.bot.sendMsg("est ce que yoni peux écrire : " + yoni, "812813246499127296", "812813246499127299");
                    count = 0;
                }
                if (((MessageReceivedEvent) event).getMessage().getContentDisplay().equals("!bon") && ((MessageReceivedEvent) event).getMessage().getAuthor().getId().equals("396964135591739392")) {
                    this.bonALlowed = !bonALlowed;
                    WebsiteApplication.bot.sendMsg("update bon value : "+this.bonALlowed, "812813246499127296", "812813246499127299");
                }
            }


    }

}

