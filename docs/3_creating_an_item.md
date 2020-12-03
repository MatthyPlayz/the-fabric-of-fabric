# Creating an Item
Welcome back! Here is how to create an item.
## Creating the base Item/Coding
In your main class outside of any method, add a variable:
```java
public static final Item EXAMPLE_ITEM = new Item(new FabricItemSettings());
```
and inside of `onInitialize`:
```java
    Registry.register(Registry.ITEM, new Identifier("your_modid", "example_item"), EXAMPLE_ITEM);
```
Replace `example_item` and `your_modid` with your item ID and mod ID respectively.
You can also replace the `EXAMPLE_ITEM` (in caps) text with your own item name, in caps and spaced with underscores.
If you start the game, and `/give` yourself the item, you should get something like this:
![](https://i.ibb.co/xhfF5GN/image.png)
## Texturing the item
To texture the item, in your resources folder, add a `assets/modid` folder with `modid` being your mod ID.
Inside of this folder, add 2 more folders: `models` and `textures`.
Inside of `models` and `textures`, add folders called `item`.
In `models/item`, create a file called `example_item.json` where `example_item` is your item ID.
Inside of this file, paste the following code:
```json
{
  "parent": "builtin/generated",
  "textures": {
    "layer0": "tutorial:item/fabric_item"
  }
}
```
Replace `fabric_item` with your item ID and `tutorial` with your mod ID.
In `textures/item`, create a drawing with a resolution of 16x16, 32x32, 64x64, 128x128, etc. with your item ID's name and ".png". It must be ".png".
You can draw your texture here.
Make sure to not use Microsoft Paint because it will have a white background. You want a transparent one. Using something like `paint.net` or GIMP will fix this.

## Names and translations
To add names to your items and translations, check out [Fabric's official wiki](https://fabricmc.net/wiki/tutorial:lang). They have great information there, and make sure to reference it.

## In result

In result, you should have an item with a texture, like the image below!
![](https://i.ibb.co/MCT8RRc/image.png)
