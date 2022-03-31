package org.spoorn.starteritems.client;

import lombok.extern.log4j.Log4j2;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Log4j2
@Environment(EnvType.CLIENT)
public class StarterItemsClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        log.info("Hello client from StarterItems!");
    }
}
