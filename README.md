# Runtime Lunar Class Finder

## Note
* This project was created for my own personal use (lunar client agent) and not meant to be public. But since Lunar has changed their init system to the Genesis thing, so I decided to make it public.

## Preparing required files
### mcp.txt
* joined.srg from [MCP](http://modcoderpack.com/) version 918
* add it to classpath `/mappings/mcp.txt`
* you can use MCPInit.kt to download it to `./file/mcp.txt` but you need to add it to classpath manually
### mappings.txt
* mappings.txt from `$HOME/.lunarclient/offline/1.8/lunar-prod-optifine.jar` `/patch/v1_8/mappings.txt`
* add it to classpath `/patch/v1_8/mappings.txt`

## How to use
```kotlin
// Initialising
LunarClassFinderMain.main(new String[0]);

// Getting a lunar class from a mcp name
val minecraftClassPatchName =
    LunarClassFinderMain.LunarClassFinderMAIN.getPatchName("net/minecraft/client/Minecraft")

println(minecraftClassPatchName) // lunar/aa/IIIIIIIIIIIIIIIIIIIIIIIII
```