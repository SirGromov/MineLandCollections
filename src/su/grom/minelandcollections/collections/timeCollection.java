﻿package su.grom.minelandcollections;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class timeCollection{
	
	public static ItemStack ItemAssembler(String arg){
		//Я в душе не ебу, что тут происходит
		
		ItemStack thing = new ItemStack(Material.AIR, 1);

		if (arg.equalsIgnoreCase("1")) {
			thing.setType(Material.FLINT_AND_STEEL);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§aПортальное устройство *Альфа*");
			thingMeta.setLore(Arrays.asList(
					"§7Высокие Технологии",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#1 из 30",
					"",
					"§3Вы: О, какая-то пушка. Возьму себе.",
					"§3АСЗТ: Зафиксирована инородная форма жизни.",
					"§3просьба положить портальное устройство,",
					"§3иначе устройство испепелит вас.",
					"§3Вы: Что? Зачем? Почему? Кто вы?",
					"§3АСЗТ: Включаю шок... Что?",
					"§3Вы: А почему от меня не остался уголёк?",
					"§3АСЗТ: Видимо, портальное устройство теперь",
					"§3принадлежит вам. Поздравляю.",
					"§3Вы: А вы так со всем новыми владельцами?",
					"§3АСЗТ: Это секретная информация."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("2")) {
			thing.setType(Material.BOOK);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§aКодекс Времени");
			thingMeta.setLore(Arrays.asList(
					"§7Толщина X",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#2 из 30",
					"",
					"§3АСЗТ: Раз вы - новый владелец устройства,",
					"§3то я вам должна выдать эту книгу. В ней",
					"§3описаны все правила пользования устройством",
					"§3и советы по устранению циклов.",
					"§3Вы: А что такое цикл?",
					"§3АСЗТ: Скоро ты сам все узнаешь."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("3")) {
			thing.setType(Material.FLINT);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§aЯдро АСЗТ");
			thingMeta.setLore(Arrays.asList(
					"§7Высокие Технологии",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#3 из 30",
					"",
					"§3Вы: АСЗТ, все-таки, что значит этот",
					"§3набор букв, к которому не подобрать",
					"§3расшифровку?",
					"§3АСЗТ: Я - Автоматическая Система",
					"§3Защиты Трансмодулей. Иными словами,",
					"§3если ты не перенесешься в эпоху или",
					"§3перенесешься частично, то я смогу",
					"§3предотвратить поломку устройства.",
					"§3Вы: Спасибо, от ваших слов мне стало",
					"§3легче."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("4")) {
			thing.setType(Material.IRON_SWORD);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§aМеч Крестоносца");
			thingMeta.setLore(Arrays.asList(
					"§7Верность III",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#4 из 30",
					"",
					"§3Вы: Что? Как я оказался в Каменном Веке?",
					"§3АСЗТ: Я тебя переместила, зная, что ты не",
					"§3читал книгу, которую я тебе дала.",
					"§3Вы: Ладно, хорошо. Но, пожалуйста, не",
					"§3перемещай меня сама. Что нам надо найти?",
					"§3АСЗТ: Что-то острое и металическое.",
					"§3Вы: Как меч? Если так, то я его вижу.",
					"§3АСЗТ: Именно. Бери его и помещай в специальный",
					"§3отсек на портальном устройстве.",
					"§3Вы: И как же мне положить его в маленький отсек?",
					"§3АСЗТ: Там установлен Чернодыровой Поглотитель."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("5")) {
			thing.setType(Material.STONE_AXE);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§eПервичный Топор");
			thingMeta.setLore(Arrays.asList(
					"§7Простота X",
					"§2Каменный Век", 
					"", 
					"§9Временная Аномалия",
					"§8#5 из 30",
					"",
					"§3Вы: О, это же моя эпоха. Можно я схожу домой?",
					"§3АСЗТ: Нет. Мы все равно переместились во времени,",
					"§3а значит тебя НИКТО не должен видеть, даже если",
					"§3это твой знакомый. Так гласит кодекс.",
					"§3Вы: Ладно, давай найдем то, что ищем и я пойду",
					"§3дальше ничего не делать.",
					"§3АСЗТ: Эта вещь принадлежит Каменному Веку. Больше",
					"§3ничего не известно. Это трудное задание.",
					"§3Вы: О, топор. Это то?",
					"§3АСЗТ: Да. Теперь быстрее бери его, иначе обитатели",
					"§3данной эпохи заберут его себе и выставят в музей."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("6"))  {
			thing.setType(Material.QUARTZ_BLOCK);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§eМраморная Колонна");
			thingMeta.setLore(Arrays.asList(
					"§7Красота V",
					"§2Античность", 
					"", 
					"§9Временная Аномалия",
					"§8#6 из 30",
					"",
					"§3Вы: Мы в Античности, что нам надо найти?",
					"§3АСЗТ: Античную колонну",
					"§3Вы: Но смысл? Она же из этого времени.",
					"§3АСЗТ: Мы должны устранять все. Даже, если вещь",
					"§3из той же эпохи, в которую переместилась. Существует",
					"§3ошибка у циклов, которая перемещает не во времени, а",
					"§3в пространстве, что облегчает возврат педмета.",
					"§3Вы: Как я понял, мы должны его вернуть?",
					"§3АСЗТ: Именно так, мы должны его вернуть. Сейчас",
					"§3высчитаю место, откуда оно могло телепортироваться"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("7"))  {
			thing.setType(Material.TNT);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§eАтомная Бомба");
			thingMeta.setLore(Arrays.asList(
					"§7Опасность XXX",
					"§7Взрыв XXX",
					"§2Ядерный Век", 
					"", 
					"§9Временная Аномалия",
					"§8#7 из 30",
					"",
					"§3Вы: Как говорил Альберт Эйнштейн: Я не зн...",
					"§3АСЗТ: Я знаю эту цитату. У меня их в базе данным много.",
					"§3АСЗТ: Лучше придумай способ как её переместить в отсек",
					"§3попутно не превратившись в уголёк.",
					"§3Вы: Но ты же у нас сверхкомпьютер.",
					"§3АСЗТ: Если бы я все умела, то Агенство не было бы созванно.",
					"§3Вы: Значит, вас нужен я?",
					"§3АСЗТ: Не совсем. Ты узнаешь позже о своем предназначении."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("8"))  {
			thing.setType(Material.GOLD_HELMET);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§eЦарская Корона");
			thingMeta.setLore(Arrays.asList(
					"§7Величие V",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#8 из 30",
					"",
					"§3АСЗТ: Какое расточительное использование золота!",
					"§3Вместо ненужной короны модно было бы произвести",
					"§3много компьютерных запчастей!",
					"§3Вы: Но они даже не значи что это такое. У них даже",
					"§3простейший мушкет считался орудием Дьявола.",
					"§3АСЗТ: Я, если что, в курсе.",
					"§3Вы: А зачем тогда это говорить?",
					"§3АСЗТ: Ну нужно же мне как-то начать диалог!"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("9"))  {
			thing.setType(Material.WATCH);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§eКарманный Хронометр");
			thingMeta.setLore(Arrays.asList(
					"§7Точность X",
					"§2Эпоха Открытий", 
					"", 
					"§9Временная Аномалия",
					"§8#9 из 30",
					"",
					"§3Вы: Какая тонкая работа! Какой материал! Мне даже",
					"§3жалко это забирать.",
					"§3АСЗТ: Но этой вещи не место в Юрсом Периоде!",
					"§3Вы: Можно я оставлю их себе?",
					"§3АСЗТ: Нет! Мы должны их вернуть!",
					"§3Вы: Но тогда как я вернусь без сувенира?",
					"§3АСЗТ: Ты что, постоянно тащил домой вещи из других эпох!?",
					"§3Вы: Ну да, а что такого?"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("10"))  {
			thing.setType(Material.WOOD_BUTTON);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dКнопка Выхода из Безвыходных Cитуаций");
			thingMeta.setLore(Arrays.asList(
					"§7Верность X",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#10 из 30",
					"",
					"§cАСЗТ: КРИТИЧЕСКИЙ СБОЙ! СРОЧНО НАЖМИТЕ КНОПКУ",
					"§cВЫХОДА ИЗ БЕЗВЫХОДНЫХ СИТУАЦИЙ, ИНАЧЕ ПОРТАЛЬНОЕ",
					"§cУСТРОЙСТВО ОТПРАВИТСЯ В ДРУГУЮ ЭПОХУ БЕЗ ВАС!",
					"§3Вы: Что? Где? Она?!",
					"§3АСЗТ: Видел бы ты свое лицо.",
					"§3Вы: Это не смешно, но все же. Где эта кнопка?",
					"§3АСЗТ: Я и сама не знаю. Я это придумала сама."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss1_1"))  {
			thing.setType(Material.IRON_HELMET);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dМаска Голема");
			thingMeta.setLore(Arrays.asList(
					"§7Камень X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#31 из 30",
					"",
					"§3АСЗТ: Предоставляю информацию о *Маска Голема*",
					"§3Приятный Женский Голос: Маска Голема - предмет",
					"§3экипировки любого голема. Именно посредством",
					"§3этой маски и осуществляется контроль над големом.",
					"§3Вы: А ты можешь так же поменять голос?",
					"§3АСЗТ: А тебе что-то не нравиться? Я могу ударить током.",
					"§3Вы: Нет-нет, все нормально."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss1_2"))  {
			thing.setType(Material.IRON_CHESTPLATE);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dЯдро Механизма");
			thingMeta.setLore(Arrays.asList(
					"§7Сложные Технологии",
					"§2Информационный Век", 
					"", 
					"§9Временная Аномалия",
					"§8#32 из 30",
					"",
					"§3АСЗТ: Вот то, что нам и нужно.",
					"§3Вы: И как мне это снять?",
					"§3АСЗТ: Победить голема, как же еще?",
					"§3Вы: Я на такое не подписывался!",
					"§3АСЗТ: Ну ладно, найду другого владельца,",
					"§3а тебя нейтрализую, потому что ты знаешь",
					"§3слишком много для обитателя 21 века.",
					"§3Вы: Хорошо, я попытаюсь его убить."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss1_3"))  {
			thing.setType(Material.IRON_LEGGINGS);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dМетеоритовые Поножи");
			thingMeta.setLore(Arrays.asList(
					"§7Скорость X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#33 из 30",
					"",
					"§3АСЗТ: Предоставляю информацию о *Метеоритовые Поножи*",
					"§3Приятный Женский Голос: Метеоритовые поножи -",
					"§3элемент экипировки голема, который дает ему",
					"§3скорость для сокращения расстояния с врагом.",
					"§3Вы: Можно поставить на повтор?",
					"§3АСЗТ: Одного раза более чем достаточно."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss1_4"))  {
			thing.setType(Material.IRON_BOOTS);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dБотинки Пушинки");
			thingMeta.setLore(Arrays.asList(
					"§7Легкость III",
					"§7Уклонение II",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#34 из 30",
					"",
					"§3АСЗТ: Можно на этот раз я не буду предоставлять",
					"§3информацию о данном предмете?",
					"§3Вы: Нет, это твоя работа. Информировать работников.",
					"§3АСЗТ: Ладно, хорошо.",
					"§3АСЗТ: Предоставляю информацию о *Ботинки Пушинки*",
					"§3Приятный Женский Голос: Ботинки Пушинки - один из",
					"§3элементов экипировки Големов. Как правило, их",
					"§3зачаровывают на мобильность и уклонение, чтобы",
					"§3голем имел превосходство над противником.",
					"§3Вы: Лучше я промолчу по поводу повтора.",
					"§3АСЗТ: И правильно делаешь."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss1_5"))  {
			thing.setType(Material.IRON_SWORD);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dМеч Разрушений");
			thingMeta.setLore(Arrays.asList(
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#35 из 30",
					"",
					"§3АСЗТ: Лучше я сама расскажу об этом мече.",
					"§3Вы: Нет, включай тот приятный голос.",
					"§3АСЗТ: Хорошо.",
					"§3Вы: Так бы сразу.",
					"§3АСЗТ: Предоставляю информацию о *Меч Разрушений*",
					"§3Голос АСЗТ: Меч Разрушений - главное атакующее",
					"§3оружие големов. Оно изготавливается из десяти",
					"§3слоев стали, что делает его более тяжелым и",
					"§3смертельным, чем другие мечи.",
					"§3Вы: Я же просил голос, как в предыдущих записях.",
					"§3АСЗТ: Вы не указали этого, поэтому озвучила все я."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("11"))  {
			thing.setType(Material.MONSTER_EGG);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§4§lБОСС: ГОЛЕМ-СТРАЖ");
			thingMeta.setLore(Arrays.asList(
					"§cВызов",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#11 из 30",
					"",
					"§3Вы: А что тут не так?",
					"§3АСЗТ: То, что мы ищем носит Голем.",
					"§3Вы: Какой Голем?",
					"§3Голем-Стражник: §cГОТОВЬТЕСЬ К СМЕРТИ, БУКАШКИ!",
					"",
					"§4ВНИМАНИЕ! Данное ЯП вызовет ОЧЕНЬ сложного монстра.",
					"§4Тщательно подготовьтесь, прежде, чем его убивать!",
					"",
					"§7Статистика:",
					"§7Иммунитет Босса: Падение, Лава, Вода",
					"§7ХП Босса: 100 Единиц(50 Сердечек)",
					"§7АТК Босса: 10 Единиц(5 Сердечек)",
					"§7Тип АТК: Ближняя",
					"§7Кол-во фаз: 2"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("12"))  {
			thing.setType(Material.GOLD_BOOTS);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dГиперЦикл");
			thingMeta.setLore(Arrays.asList(
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#12 из 30",
					"",
					"§3АСЗТ: ГиперЦикл - новейшее приспособление",
					"§3для перемещения в пространстве. Принцип его",
					"§3работы лучше тебе не объяснять.",
					"§3Вы: Почему же?",
					"§3АСЗТ: Ты можешь удрать с ним, а мне того не надо.",
					"§3Вы: Надеюсь, оно не включается одной кнопкой?",
					"§3АСЗТ: Нет, для начала нужно сказать слово разблокировки.",
					"§3Вы: И какое же оно?",
					"§3АСЗТ: И не надейся. Оно должно быть произнесено моим",
					"§3голосом. Поэтому я никогда не говорю слово *Огурец*.",
					"§3Вы: А-а-а-а-а."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("13"))  {
			thing.setType(Material.BANNER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dФлаг Судьбы");
			thingMeta.setLore(Arrays.asList(
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#13 из 30",
					"",
					"§3АСЗТ: Какой красивый флаг.",
					"§3Вы: По узорам, он из Средневековья.",
					"§3АСЗТ: Загружаю инвормацию.",
					"§cПрошло 10 минут.",
					"§3АСЗТ: Да, он из Средневековья.",
					"§3Вы: Ну пошли, вернем его.",
					"§3АСЗТ: Вычисляю координаты.",
					"§3Вы: Ну нет, я догадаюсь где оно."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("14"))  {
			thing.setType(Material.GREEN_RECORD);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§4§lВедьмачий Гнев");
			thingMeta.setLore(Arrays.asList(
					"§7Свинопасы",
					"§cПроклятье Ярости",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#14 из 30",
					"",
					"§3Вы: АСЗТ, проиграй пластинку.",
					"§3АСЗТ: Хорошо. Давай сюда.",
					"§3Голос пожилого мужчины: РАЗОЙДИСЬ,",
					"§3СВИНОПАСЫ, А ТО ГОСПОДИН ВЕДЬМАК ВАМ",
					"§3ТАКОЙ БАН ОТВЕСИТ ВОВЕК НЕ ЗАБУДИТЕ!",
					"§3Ведьмак: ГДЕ ТУТ ДРЫН КАКОЙ-НИБУДЬ?!",
					"§3Еще один голос: Покажи, чему обучен.",
					"§3Ведьмак: Тебе меня долго",
					"§3уговаривать не придется!!!",
					"§3Вы: Кошмар..."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("15"))  {
			thing.setType(Material.EYE_OF_ENDER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dПесчанная Отметка");
			thingMeta.setLore(Arrays.asList(
					"§6Благословление Песков",
					"§2Античность", 
					"", 
					"§9Временная Аномалия",
					"§8#15 из 30",
					"",
					"§3АСЗТ: Что-то мне не нравится эта вещь...",
					"§3Вы: И что же в ней такого? Просто безделушка.",
					"§3АСЗТ: Она пульсирует первозданной энергией.",
					"§3Вы: Наоборот, это же должно быть хорошо.",
					"§3АСЗТ: Как бы то ни было, не стоит ее держать",
					"§3в руках долго. Мы не знаем, что она делает.",
					"§3Вы: Ну хорошо, давай вернем ее на место."));
			thing.setItemMeta(thingMeta);;
		}
		
		else if (arg.equalsIgnoreCase("16"))  {
			thing.setType(Material.ENDER_PEARL);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dКарманная Черная Дыра");
			thingMeta.setLore(Arrays.asList(
					"§7Вместимость XXX",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#16 из 30",
					"",
					"§3Вы: Что это такое?",
					"§3АСЗТ: Новейшая разработка,",
					"§3которая попала в Атомный Век.",
					"§3Вы: А что она умеет?",
					"§3АСЗТ: Это переносное бездонное",
					"§3хранилище для кучи предметов.",
					"§3Вы: Можно я попользуюсь?",
					"§3АСЗТ: Нет, верни в мою эпоху."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("17"))  {
			thing.setType(Material.MONSTER_EGG);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§4§lБОСС - КОРОЛЬ АРТУР");
			thingMeta.setLore(Arrays.asList(
					"§cВызов",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#17 из 30",
					"",
					"§3Вы: Круглый Стол? А где его частый посетитель?",
					"§3АСЗТ: Вот он!",
					"§3Вы: Где?",
					"§3Король Артур: §cЧто вы тут делаете? Вам тут не место!",
					"",
					"§4ВНИМАНИЕ! Данное ЯП вызовет ОЧЕНЬ сложного монстра.",
					"§4Тщательно подготовьтесь, прежде, чем его убивать!",
					"",
					"§7Статистика:",
					"§7Иммунитет Босса: Падение, Лава, Вода",
					"§7ХП Босса: 500 Единиц(250 Сердечек)",
					"§7АТК Босса: 16 Единиц(8 Сердечек)",
					"§7Тип АТК: Ближняя",
					"§7Кол-во фаз: 2"));
			thing.setItemMeta(thingMeta);;
		}
		
		else if (arg.equalsIgnoreCase("boss2_1"))  {
			thing.setType(Material.DIAMOND_SWORD);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§bЭкскалибур МК-II");
			thingMeta.setLore(Arrays.asList(
					"§7Верность V",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#36 из 30",
					"",
					"§3Король Артур: Нет, это меч мне достался таким трудом...",
					"§3АСЗТ: Этот меч принадлежит не тебе, а Совету Времени!",
					"§3Король Артур: Я не знал. Он снизошел на меня во время",
					"§3молитв перед ожесточенной схваткой!",
					"§3Вы: Да, АСЗТ любит говорит, не разобравшись. Я тебе верю.",
					"§3АСЗТ: Все же не надо набрасываться на людей из укрытия."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss2_2"))  {
			thing.setType(Material.LOG);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§bВенец Короля");
			thingMeta.setLore(Arrays.asList(
					"§7Величие X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#37 из 30",
					"",
					"§3Вы: Я жду разъяснений, зачем ему корона.",
					"§3АСЗТ: Но у меня нет записи по эту корону.",
					"§3Вы: Как так? Ты же всезнающий сверхкомпьютер!",
					"§3АСЗТ: Я лишь пользуюсь сведениями из базы.",
					"§3Вы: Ну а там нет такой важной информации?",
					"§3АСЗТ: Да, нет, очень жаль."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss2_3"))  {
			thing.setType(Material.CHAINMAIL_CHESTPLATE);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§bРыцарский Доспех");
			thingMeta.setLore(Arrays.asList(
					"§7Тяжесть X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#38 из 30",
					"",
					"§3АСЗТ: Загружаю информацию о *Рыцарский Доспех*.",
					"§3Рыцарский доспех - один из элементов экипировки",
					"§3рыцарей периода Средневековья. Обычно, их делали",
					"§3из железа, поэтому они очень тяжелые для обитателя",
					"§321-го века.",
					"§3Вы: Кого-кого?"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss2_4"))  {
			thing.setType(Material.IRON_LEGGINGS);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§bРыцарские Поножи");
			thingMeta.setLore(Arrays.asList(
					"§7Тяжесть X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#39 из 30",
					"",
					"§3АСЗТ: Загружаю информацию о *Рыцарские Поножи*.",
					"§3Рыцарские Поножи - один из элементов экипировки",
					"§3рыцарей периода Средневековья. Обычно, их делали",
					"§3из железа, поэтому они очень тяжелые для обитателя",
					"§321-го века.",
					"§3Вы: Опять меня упомянули как *Обитателя*..."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss2_5"))  {
			thing.setType(Material.IRON_LEGGINGS);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§bРыцарские Ботинки");
			thingMeta.setLore(Arrays.asList(
					"§7Тяжесть X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#40 из 30",
					"",
					"§3АСЗТ: Загружаю информацию о *Рыцарские Ботинки*.",
					"§3Рыцарские Ботинки - один из элементов экипировки",
					"§3рыцарей периода Средневековья. Обычно, их делали",
					"§3из железа, поэтому они очень тяжелые для обитателя",
					"§321-го века.",
					"§3АСЗТ: Ладно, про обитателя добавила я.",
					"§3Вы: Так бы сразу и сказала!"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("18"))  {
			thing.setType(Material.BRICK);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§сБронза");
			thingMeta.setLore(Arrays.asList(
					"§2Бронзовый Век", 
					"", 
					"§9Временная Аномалия",
					"§8#18 из 30",
					"",
					"§3Вы: Бронза? В Юрском Периоде?",
					"§3АСЗТ: Да. Вычисляю, откуда она",
					"§3переместилась в данную эпоху.",
					"§3Вы: Ставлю 10 алмазов, что из",
					"§3бронзового века.",
					"§3АСЗТ: Да, она из бронзового века.",
					"§3Вы: Где мои алмазы?",
					"§3АСЗТ: А я разве спорила?"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("19"))  {
			thing.setType(Material.BRICK);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§cОбсидиановый Топор");
			thingMeta.setLore(Arrays.asList(
					"§7Ремесло V",
					"§2Каменный Век", 
					"", 
					"§9Временная Аномалия",
					"§8#19 из 30",
					"",
					"§3Вы: Деревянный меч, в который",
					"§3вставлены кусочки обсидиана.",
					"§3Эта вещь из каменного века.",
					"§3Принадлежит культуре Майя.",
					"§3АСЗТ: Слишком глубокие познания",
					"§3для обитателя 21-го века.",
					"§3Вы: Почему ты меня так называешь?"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("21"))  {
			thing.setType(Material.PAPER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§6Тайное Знание");
			thingMeta.setLore(Arrays.asList(
					"§7Качество Бумаги: Высокое",
					"§7Качество Чернил: Высокое",
					"§2Рассвет Китая", 
					"", 
					"§9Временная Аномалия",
					"§8#21 из 30",
					"",
					"§3Вы: Что написано в этом пергаменте?",
					"§3АСЗТ: Возможно, какая-то техника боя.",
					"§3Вы: Ты не мощещь перевести?",
					"§3АСЗТ: Китайский язык - один из самых",
					"§3сложных для перевода. и вообще, я не",
					"§3на это запрограммированна.",
					"§3Вы: Я усомнился в твоем интеллекте..."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("22"))  {
			thing.setType(Material.FISHING_ROD);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§6Ловец Времен");
			thingMeta.setLore(Arrays.asList(
					"§7Точность X",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#22 из 30",
					"",
					"§3Вы: Дай угад...",
					"§3АСЗТ: Это - новая разработка.",
					"§3Вы: Я знал. И знаю ее назна...",
					"§3АСЗТ: Она призвана автоматизировать",
					"§3процесс ручной рыбалки. Единствен...",
					"§3Вы: Бла-бла-бла, я тебя перебиваю"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("23"))  {
			thing.setType(Material.PAPER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§6Титановые Когти");
			thingMeta.setLore(Arrays.asList(
					"§7Механизм XX",
					"§2Век Открытий", 
					"", 
					"§9Временная Аномалия",
					"§8#23 из 30",
					"",
					"§3АСЗТ: Когти из титана. Использовались",
					"§3в бою. Имеют механизм для еще большей",
					"§3силы и мощи атаки.",
					"§3Вы: Можно примерить?",
					"§3АСЗТ: Нет. Так же они имеют замок для",
					"§3лучшей фиксации на руке владельца."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("26"))  {
			thing.setType(Material.MONSTER_EGG);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§4§lБОСС - ЛОРД ВРЕМЯ");
			thingMeta.setLore(Arrays.asList(
					"§cВызов",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#26 из 30",
					"",
					"§3АСЗТ: И так, мне давно пора было сказать, зачем ты нам.",
					"§3АСЗТ: Дело в том, что циклы открывает человек, который",
					"§3называет себя временным лордом. Пришла пора сразиться с ним.",
					"§3Лорд ВРЕМЯ: §cХА-ХА-ХА! Вас я и ждал! В бой!",
					"",
					"§4ВНИМАНИЕ! Данное ЯП вызовет ОЧЕНЬ сложного монстра.",
					"§4Тщательно подготовьтесь, прежде, чем его убивать!",
					"",
					"§7Статистика:",
					"§7Иммунитет Босса: Падение, Лава, Вода",
					"§7ХП Босса: 2000 Единиц(1000 Сердечек)",
					"§7АТК Босса: 20 Единиц(10 Сердечек)",
					"§7Тип АТК: Магия",
					"§7Кол-во фаз: 3"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("27"))  {
			thing.setType(Material.MONSTER_EGG);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§4§lБОСС - ХРАНИТЕЛЬ КИРКИ");
			thingMeta.setLore(Arrays.asList(
					"§cВызов",
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#27 из 30",
					"",
					"§3Вы: АСЗТ, а где же Первомрак?",
					"§3АСЗТ: Сейчас ты все узнаешь. Он был похищен, но мы его вернем.",
					"§3Так же его модифицировали, и теперь он лучше и быстрее.",
					"§3Хранитель Кирки: *шипящие звуки атаки*",
					"",
					"§4ВНИМАНИЕ! Данное ЯП вызовет ОЧЕНЬ сложного монстра.",
					"§4Тщательно подготовьтесь, прежде, чем его убивать!",
					"",
					"§7Статистика:",
					"§7Иммунитет Босса: Падение, Лава, Вода",
					"§7ХП Босса: 100 Единиц(50 Сердечек)",
					"§7АТК Босса: 8 Единиц(4 Сердечка)",
					"§7Тип АТК: Ближний",
					"§7Кол-во фаз: 2"));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("boss4_1"))  {
			thing.setType(Material.DIAMOND_PICKAXE);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§dПервомрак МК-II");
			thingMeta.setLore(Arrays.asList(
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#41 из 30",
					"",
					"§3АСЗТ: Все-же ты выбил эту кирку. Поздравляю!",
					"§3Вы: Мне ее вернуть?",
					"§3АСЗТ: Нет, можешь оставить себе. Я не возражаю."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("28"))  {
			thing.setType(Material.PAPER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§8§lМеч Духа");
			thingMeta.setLore(Arrays.asList(
					"§7Просвещение X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#28 из 30",
					"",
					"§3АСЗТ: Меч Духа - один из двух мечей",
					"§3созедания. Имеет способность управлять",
					"§3душами жертв. По крайней мере, так",
					"§3гласит легенда.",
					"§3Вы: А где второй?",
					"§3АСЗТ: Где-то рядом."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("29"))  {
			thing.setType(Material.PAPER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§f§lМеч Разума");
			thingMeta.setLore(Arrays.asList(
					"§7Просвещение X",
					"§2Средневековье", 
					"", 
					"§9Временная Аномалия",
					"§8#29 из 30",
					"",
					"§3АСЗТ: Меч Разума - один из двух мечей",
					"§3созедания. Имеет способность управлять",
					"§3разумом жертв. По крайней мере, так",
					"§3гласит легенда.",
					"§3Вы: А где второй?",
					"§3АСЗТ: Где-то рядом."));
			thing.setItemMeta(thingMeta);
		}
		
		else if (arg.equalsIgnoreCase("30"))  {
			thing.setType(Material.PAPER);
			ItemMeta thingMeta = thing.getItemMeta();
			thingMeta.setDisplayName("§6§lВолнорезы-Рессоры");
			thingMeta.setLore(Arrays.asList(
					"§2Век АСЗТ", 
					"", 
					"§9Временная Аномалия",
					"§8#30 из 30",
					"",
					"§3АСЗТ: Итак, обитатель 21-го века, я,",
					"§3от лица Агенства, благодарю тебя за",
					"§3проделанный путь. Как подарок, ты",
					"§3можешь носить эти ботинки, которые",
					"§3защитят тебя почти от всего.",
					"§3Вы: Крууууто!"));
			thing.setItemMeta(thingMeta);
		}
		
		return thing;
	}
}
