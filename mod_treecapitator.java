package net.minecraft.src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import bspkrs.treecapitator.TreeCapitator;
import bspkrs.util.ModVersionChecker;

import net.minecraft.server.MinecraftServer;

public class mod_treecapitator extends BaseModMp
{
    @MLProp(info=TreeCapitator.axeIDListDesc)
    public static String axeIDList = TreeCapitator.axeIDList;
    @MLProp(info=TreeCapitator.needItemDesc)
    public static boolean needItem = TreeCapitator.needItem;
    @MLProp(info=TreeCapitator.onlyDestroyUpwardsDesc)
    public static boolean onlyDestroyUpwards = TreeCapitator.onlyDestroyUpwards;
    @MLProp(info=TreeCapitator.destroyLeavesDesc)
    public static boolean destroyLeaves = TreeCapitator.destroyLeaves;
    @MLProp(info=TreeCapitator.shearLeavesDesc)
    public static boolean shearLeaves = TreeCapitator.shearLeaves;
    @MLProp(info=TreeCapitator.shearVinesDesc)
    public static boolean shearVines = TreeCapitator.shearVines;
    @MLProp(info=TreeCapitator.shearIDListDesc)
    public static String shearIDList = TreeCapitator.shearIDList;
    @MLProp(info=TreeCapitator.logHardnessNormalDesc)
    public static float logHardnessNormal = TreeCapitator.logHardnessNormal;
    @MLProp(info=TreeCapitator.logHardnessModifiedDesc)
    public static float logHardnessModified = TreeCapitator.logHardnessModified;
    @MLProp(info=TreeCapitator.disableInCreativeDesc)
    public static boolean disableInCreative = TreeCapitator.disableInCreative;
    @MLProp(info=TreeCapitator.disableCreativeDropsDesc)
    public static boolean disableCreativeDrops = TreeCapitator.disableCreativeDrops;
    @MLProp(info=TreeCapitator.allowItemDamageDesc)
    public static boolean allowItemDamage = TreeCapitator.allowItemDamage;
    @MLProp(info=TreeCapitator.allowMoreBlocksThanDamageDesc)
    public static boolean allowMoreBlocksThanDamage = TreeCapitator.allowMoreBlocksThanDamage;
    @MLProp(info=TreeCapitator.sneakActionDesc)
    public static String sneakAction = TreeCapitator.sneakAction;
    @MLProp(info=TreeCapitator.maxBreakDistanceDesc + "\n\n**ONLY EDIT WHAT IS BELOW THIS**")
    public static int maxBreakDistance = TreeCapitator.maxBreakDistance;

    private ModVersionChecker versionChecker;
    private String versionURL = "https://dl.dropbox.com/u/20748481/Minecraft/1.3.1/treeCapitatorMLMP.version";
    private String mcfTopic = "http://www.minecraftforum.net/topic/1009577-";

    public mod_treecapitator()
    {
        versionChecker = new ModVersionChecker(getName(), getVersion(), versionURL, mcfTopic, ModLoader.getLogger());
        TreeCapitator.init();
        TreeCapitator.axeIDList = axeIDList;
        TreeCapitator.needItem = needItem;
        TreeCapitator.onlyDestroyUpwards = onlyDestroyUpwards;
        TreeCapitator.destroyLeaves = destroyLeaves;
        TreeCapitator.shearLeaves = shearLeaves;
        TreeCapitator.shearVines = shearVines;
        TreeCapitator.shearIDList = shearIDList;
        TreeCapitator.logHardnessNormal = logHardnessNormal;
        TreeCapitator.logHardnessModified = logHardnessModified;
        TreeCapitator.disableInCreative = disableInCreative;
        TreeCapitator.disableCreativeDrops = disableCreativeDrops;
        TreeCapitator.allowItemDamage = allowItemDamage;
        TreeCapitator.allowMoreBlocksThanDamage = allowMoreBlocksThanDamage;
        TreeCapitator.sneakAction = sneakAction;
        TreeCapitator.maxBreakDistance = maxBreakDistance;
    }

    @Override
    public String getName()
    {
        return "TreeCapitator";
    }

    @Override
    public String getVersion()
    {
        return "MLMP " + TreeCapitator.versionNumber;
    }

    @Override
    public void load()
    {
        versionChecker.checkVersionWithLogging();
    }

    @Override
    public boolean hasClientSide()
    {
        return false;
    }
}
