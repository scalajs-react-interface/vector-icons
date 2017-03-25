package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactClass, ReactElement}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

object Entypo {

  @inline
  def apply(
      name: OptionalParam[EntypoIconName] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      color: OptionalParam[String] = OptDefault,
      size: OptionalParam[Double] = OptDefault
  ): ReactElement = {
    val p = FunctionObjectMacro()
    CreateElementJS[EntypoComponent.type](EntypoComponent, p)
  }
}

@js.native
@JSImport("react-native-vector-icons/Entypo", JSImport.Default)
object EntypoComponent extends JSComponent[js.Object]

@ScalaJSDefined
trait EntypoIconName extends js.Object

object EntypoList {

  @inline def _500PX = "500px".asInstanceOf[EntypoIconName]
  @inline def _500PX_WITH_CIRCLE =
    "500px-with-circle".asInstanceOf[EntypoIconName]
  @inline def ADD_TO_LIST = "add-to-list".asInstanceOf[EntypoIconName]
  @inline def ADD_USER = "add-user".asInstanceOf[EntypoIconName]
  @inline def ADDRESS = "address".asInstanceOf[EntypoIconName]
  @inline def ADJUST = "adjust".asInstanceOf[EntypoIconName]
  @inline def AIR = "air".asInstanceOf[EntypoIconName]
  @inline def AIRCRAFT = "aircraft".asInstanceOf[EntypoIconName]
  @inline def AIRCRAFT_LANDING =
    "aircraft-landing".asInstanceOf[EntypoIconName]
  @inline def AIRCRAFT_TAKE_OFF =
    "aircraft-take-off".asInstanceOf[EntypoIconName]
  @inline def ALIGN_BOTTOM = "align-bottom".asInstanceOf[EntypoIconName]
  @inline def ALIGN_HORIZONTAL_MIDDLE =
    "align-horizontal-middle".asInstanceOf[EntypoIconName]
  @inline def ALIGN_LEFT = "align-left".asInstanceOf[EntypoIconName]
  @inline def ALIGN_RIGHT = "align-right".asInstanceOf[EntypoIconName]
  @inline def ALIGN_TOP = "align-top".asInstanceOf[EntypoIconName]
  @inline def ALIGN_VERTICAL_MIDDLE =
    "align-vertical-middle".asInstanceOf[EntypoIconName]
  @inline def APP_STORE = "app-store".asInstanceOf[EntypoIconName]
  @inline def ARCHIVE = "archive".asInstanceOf[EntypoIconName]
  @inline def AREA_GRAPH = "area-graph".asInstanceOf[EntypoIconName]
  @inline def ARROW_BOLD_DOWN = "arrow-bold-down".asInstanceOf[EntypoIconName]
  @inline def ARROW_BOLD_LEFT = "arrow-bold-left".asInstanceOf[EntypoIconName]
  @inline def ARROW_BOLD_RIGHT =
    "arrow-bold-right".asInstanceOf[EntypoIconName]
  @inline def ARROW_BOLD_UP = "arrow-bold-up".asInstanceOf[EntypoIconName]
  @inline def ARROW_DOWN = "arrow-down".asInstanceOf[EntypoIconName]
  @inline def ARROW_LEFT = "arrow-left".asInstanceOf[EntypoIconName]
  @inline def ARROW_LONG_DOWN = "arrow-long-down".asInstanceOf[EntypoIconName]
  @inline def ARROW_LONG_LEFT = "arrow-long-left".asInstanceOf[EntypoIconName]
  @inline def ARROW_LONG_RIGHT =
    "arrow-long-right".asInstanceOf[EntypoIconName]
  @inline def ARROW_LONG_UP = "arrow-long-up".asInstanceOf[EntypoIconName]
  @inline def ARROW_RIGHT = "arrow-right".asInstanceOf[EntypoIconName]
  @inline def ARROW_UP = "arrow-up".asInstanceOf[EntypoIconName]
  @inline def ARROW_WITH_CIRCLE_DOWN =
    "arrow-with-circle-down".asInstanceOf[EntypoIconName]
  @inline def ARROW_WITH_CIRCLE_LEFT =
    "arrow-with-circle-left".asInstanceOf[EntypoIconName]
  @inline def ARROW_WITH_CIRCLE_RIGHT =
    "arrow-with-circle-right".asInstanceOf[EntypoIconName]
  @inline def ARROW_WITH_CIRCLE_UP =
    "arrow-with-circle-up".asInstanceOf[EntypoIconName]
  @inline def ATTACHMENT = "attachment".asInstanceOf[EntypoIconName]
  @inline def AWARENESS_RIBBON =
    "awareness-ribbon".asInstanceOf[EntypoIconName]
  @inline def BACK = "back".asInstanceOf[EntypoIconName]
  @inline def BACK_IN_TIME = "back-in-time".asInstanceOf[EntypoIconName]
  @inline def BAIDU = "baidu".asInstanceOf[EntypoIconName]
  @inline def BAR_GRAPH = "bar-graph".asInstanceOf[EntypoIconName]
  @inline def BASECAMP = "basecamp".asInstanceOf[EntypoIconName]
  @inline def BATTERY = "battery".asInstanceOf[EntypoIconName]
  @inline def BEAMED_NOTE = "beamed-note".asInstanceOf[EntypoIconName]
  @inline def BEHANCE = "behance".asInstanceOf[EntypoIconName]
  @inline def BELL = "bell".asInstanceOf[EntypoIconName]
  @inline def BLACKBOARD = "blackboard".asInstanceOf[EntypoIconName]
  @inline def BLOCK = "block".asInstanceOf[EntypoIconName]
  @inline def BOOK = "book".asInstanceOf[EntypoIconName]
  @inline def BOOKMARK = "bookmark".asInstanceOf[EntypoIconName]
  @inline def BOOKMARKS = "bookmarks".asInstanceOf[EntypoIconName]
  @inline def BOWL = "bowl".asInstanceOf[EntypoIconName]
  @inline def BOX = "box".asInstanceOf[EntypoIconName]
  @inline def BRIEFCASE = "briefcase".asInstanceOf[EntypoIconName]
  @inline def BROWSER = "browser".asInstanceOf[EntypoIconName]
  @inline def BRUSH = "brush".asInstanceOf[EntypoIconName]
  @inline def BUCKET = "bucket".asInstanceOf[EntypoIconName]
  @inline def BUG = "bug".asInstanceOf[EntypoIconName]
  @inline def CAKE = "cake".asInstanceOf[EntypoIconName]
  @inline def CALCULATOR = "calculator".asInstanceOf[EntypoIconName]
  @inline def CALENDAR = "calendar".asInstanceOf[EntypoIconName]
  @inline def CAMERA = "camera".asInstanceOf[EntypoIconName]
  @inline def CCW = "ccw".asInstanceOf[EntypoIconName]
  @inline def CHAT = "chat".asInstanceOf[EntypoIconName]
  @inline def CHECK = "check".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_DOWN = "chevron-down".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_LEFT = "chevron-left".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_RIGHT = "chevron-right".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_SMALL_DOWN =
    "chevron-small-down".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_SMALL_LEFT =
    "chevron-small-left".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_SMALL_RIGHT =
    "chevron-small-right".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_SMALL_UP =
    "chevron-small-up".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_THIN_DOWN =
    "chevron-thin-down".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_THIN_LEFT =
    "chevron-thin-left".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_THIN_RIGHT =
    "chevron-thin-right".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_THIN_UP = "chevron-thin-up".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_UP = "chevron-up".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_WITH_CIRCLE_DOWN =
    "chevron-with-circle-down".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_WITH_CIRCLE_LEFT =
    "chevron-with-circle-left".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_WITH_CIRCLE_RIGHT =
    "chevron-with-circle-right".asInstanceOf[EntypoIconName]
  @inline def CHEVRON_WITH_CIRCLE_UP =
    "chevron-with-circle-up".asInstanceOf[EntypoIconName]
  @inline def CIRCLE = "circle".asInstanceOf[EntypoIconName]
  @inline def CIRCLE_WITH_CROSS =
    "circle-with-cross".asInstanceOf[EntypoIconName]
  @inline def CIRCLE_WITH_MINUS =
    "circle-with-minus".asInstanceOf[EntypoIconName]
  @inline def CIRCLE_WITH_PLUS =
    "circle-with-plus".asInstanceOf[EntypoIconName]
  @inline def CIRCULAR_GRAPH = "circular-graph".asInstanceOf[EntypoIconName]
  @inline def CLAPPERBOARD = "clapperboard".asInstanceOf[EntypoIconName]
  @inline def CLASSIC_COMPUTER =
    "classic-computer".asInstanceOf[EntypoIconName]
  @inline def CLIPBOARD = "clipboard".asInstanceOf[EntypoIconName]
  @inline def CLOCK = "clock".asInstanceOf[EntypoIconName]
  @inline def CLOUD = "cloud".asInstanceOf[EntypoIconName]
  @inline def CODE = "code".asInstanceOf[EntypoIconName]
  @inline def COG = "cog".asInstanceOf[EntypoIconName]
  @inline def COLOURS = "colours".asInstanceOf[EntypoIconName]
  @inline def COMPASS = "compass".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_FAST_BACKWARD =
    "controller-fast-backward".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_FAST_FORWARD =
    "controller-fast-forward".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_JUMP_TO_START =
    "controller-jump-to-start".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_NEXT = "controller-next".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_PAUS = "controller-paus".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_PLAY = "controller-play".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_RECORD =
    "controller-record".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_STOP = "controller-stop".asInstanceOf[EntypoIconName]
  @inline def CONTROLLER_VOLUME =
    "controller-volume".asInstanceOf[EntypoIconName]
  @inline def COPY = "copy".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_CLOUD = "creative-cloud".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS =
    "creative-commons".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_ATTRIBUTION =
    "creative-commons-attribution".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_NODERIVS =
    "creative-commons-noderivs".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_NONCOMMERCIAL_EU =
    "creative-commons-noncommercial-eu".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_NONCOMMERCIAL_US =
    "creative-commons-noncommercial-us".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_PUBLIC_DOMAIN =
    "creative-commons-public-domain".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_REMIX =
    "creative-commons-remix".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_SHARE =
    "creative-commons-share".asInstanceOf[EntypoIconName]
  @inline def CREATIVE_COMMONS_SHAREALIKE =
    "creative-commons-sharealike".asInstanceOf[EntypoIconName]
  @inline def CREDIT = "credit".asInstanceOf[EntypoIconName]
  @inline def CREDIT_CARD = "credit-card".asInstanceOf[EntypoIconName]
  @inline def CROP = "crop".asInstanceOf[EntypoIconName]
  @inline def CROSS = "cross".asInstanceOf[EntypoIconName]
  @inline def CUP = "cup".asInstanceOf[EntypoIconName]
  @inline def CW = "cw".asInstanceOf[EntypoIconName]
  @inline def CYCLE = "cycle".asInstanceOf[EntypoIconName]
  @inline def DATABASE = "database".asInstanceOf[EntypoIconName]
  @inline def DIAL_PAD = "dial-pad".asInstanceOf[EntypoIconName]
  @inline def DIRECTION = "direction".asInstanceOf[EntypoIconName]
  @inline def DOCUMENT = "document".asInstanceOf[EntypoIconName]
  @inline def DOCUMENT_LANDSCAPE =
    "document-landscape".asInstanceOf[EntypoIconName]
  @inline def DOCUMENTS = "documents".asInstanceOf[EntypoIconName]
  @inline def DOT_SINGLE = "dot-single".asInstanceOf[EntypoIconName]
  @inline def DOTS_THREE_HORIZONTAL =
    "dots-three-horizontal".asInstanceOf[EntypoIconName]
  @inline def DOTS_THREE_VERTICAL =
    "dots-three-vertical".asInstanceOf[EntypoIconName]
  @inline def DOTS_TWO_HORIZONTAL =
    "dots-two-horizontal".asInstanceOf[EntypoIconName]
  @inline def DOTS_TWO_VERTICAL =
    "dots-two-vertical".asInstanceOf[EntypoIconName]
  @inline def DOWNLOAD = "download".asInstanceOf[EntypoIconName]
  @inline def DRIBBBLE = "dribbble".asInstanceOf[EntypoIconName]
  @inline def DRIBBBLE_WITH_CIRCLE =
    "dribbble-with-circle".asInstanceOf[EntypoIconName]
  @inline def DRINK = "drink".asInstanceOf[EntypoIconName]
  @inline def DRIVE = "drive".asInstanceOf[EntypoIconName]
  @inline def DROP = "drop".asInstanceOf[EntypoIconName]
  @inline def DROPBOX = "dropbox".asInstanceOf[EntypoIconName]
  @inline def EDIT = "edit".asInstanceOf[EntypoIconName]
  @inline def EMAIL = "email".asInstanceOf[EntypoIconName]
  @inline def EMOJI_FLIRT = "emoji-flirt".asInstanceOf[EntypoIconName]
  @inline def EMOJI_HAPPY = "emoji-happy".asInstanceOf[EntypoIconName]
  @inline def EMOJI_NEUTRAL = "emoji-neutral".asInstanceOf[EntypoIconName]
  @inline def EMOJI_SAD = "emoji-sad".asInstanceOf[EntypoIconName]
  @inline def ERASE = "erase".asInstanceOf[EntypoIconName]
  @inline def ERASER = "eraser".asInstanceOf[EntypoIconName]
  @inline def EVERNOTE = "evernote".asInstanceOf[EntypoIconName]
  @inline def EXPORT = "export".asInstanceOf[EntypoIconName]
  @inline def EYE = "eye".asInstanceOf[EntypoIconName]
  @inline def EYE_WITH_LINE = "eye-with-line".asInstanceOf[EntypoIconName]
  @inline def FACEBOOK = "facebook".asInstanceOf[EntypoIconName]
  @inline def FACEBOOK_WITH_CIRCLE =
    "facebook-with-circle".asInstanceOf[EntypoIconName]
  @inline def FEATHER = "feather".asInstanceOf[EntypoIconName]
  @inline def FINGERPRINT = "fingerprint".asInstanceOf[EntypoIconName]
  @inline def FLAG = "flag".asInstanceOf[EntypoIconName]
  @inline def FLASH = "flash".asInstanceOf[EntypoIconName]
  @inline def FLASHLIGHT = "flashlight".asInstanceOf[EntypoIconName]
  @inline def FLAT_BRUSH = "flat-brush".asInstanceOf[EntypoIconName]
  @inline def FLATTR = "flattr".asInstanceOf[EntypoIconName]
  @inline def FLICKR = "flickr".asInstanceOf[EntypoIconName]
  @inline def FLICKR_WITH_CIRCLE =
    "flickr-with-circle".asInstanceOf[EntypoIconName]
  @inline def FLOW_BRANCH = "flow-branch".asInstanceOf[EntypoIconName]
  @inline def FLOW_CASCADE = "flow-cascade".asInstanceOf[EntypoIconName]
  @inline def FLOW_LINE = "flow-line".asInstanceOf[EntypoIconName]
  @inline def FLOW_PARALLEL = "flow-parallel".asInstanceOf[EntypoIconName]
  @inline def FLOW_TREE = "flow-tree".asInstanceOf[EntypoIconName]
  @inline def FLOWER = "flower".asInstanceOf[EntypoIconName]
  @inline def FOLDER = "folder".asInstanceOf[EntypoIconName]
  @inline def FOLDER_IMAGES = "folder-images".asInstanceOf[EntypoIconName]
  @inline def FOLDER_MUSIC = "folder-music".asInstanceOf[EntypoIconName]
  @inline def FOLDER_VIDEO = "folder-video".asInstanceOf[EntypoIconName]
  @inline def FORWARD = "forward".asInstanceOf[EntypoIconName]
  @inline def FOURSQUARE = "foursquare".asInstanceOf[EntypoIconName]
  @inline def FUNNEL = "funnel".asInstanceOf[EntypoIconName]
  @inline def GAME_CONTROLLER = "game-controller".asInstanceOf[EntypoIconName]
  @inline def GAUGE = "gauge".asInstanceOf[EntypoIconName]
  @inline def GITHUB = "github".asInstanceOf[EntypoIconName]
  @inline def GITHUB_WITH_CIRCLE =
    "github-with-circle".asInstanceOf[EntypoIconName]
  @inline def GLOBE = "globe".asInstanceOf[EntypoIconName]
  @inline def GOOGLE_ = "google-".asInstanceOf[EntypoIconName]
  @inline def GOOGLE__WITH_CIRCLE =
    "google--with-circle".asInstanceOf[EntypoIconName]
  @inline def GOOGLE_DRIVE = "google-drive".asInstanceOf[EntypoIconName]
  @inline def GOOGLE_HANGOUTS = "google-hangouts".asInstanceOf[EntypoIconName]
  @inline def GOOGLE_PLAY = "google-play".asInstanceOf[EntypoIconName]
  @inline def GRADUATION_CAP = "graduation-cap".asInstanceOf[EntypoIconName]
  @inline def GRID = "grid".asInstanceOf[EntypoIconName]
  @inline def GROOVESHARK = "grooveshark".asInstanceOf[EntypoIconName]
  @inline def HAIR_CROSS = "hair-cross".asInstanceOf[EntypoIconName]
  @inline def HAND = "hand".asInstanceOf[EntypoIconName]
  @inline def HEART = "heart".asInstanceOf[EntypoIconName]
  @inline def HEART_OUTLINED = "heart-outlined".asInstanceOf[EntypoIconName]
  @inline def HELP = "help".asInstanceOf[EntypoIconName]
  @inline def HELP_WITH_CIRCLE =
    "help-with-circle".asInstanceOf[EntypoIconName]
  @inline def HOME = "home".asInstanceOf[EntypoIconName]
  @inline def HOUR_GLASS = "hour-glass".asInstanceOf[EntypoIconName]
  @inline def HOUZZ = "houzz".asInstanceOf[EntypoIconName]
  @inline def ICLOUD = "icloud".asInstanceOf[EntypoIconName]
  @inline def IMAGE = "image".asInstanceOf[EntypoIconName]
  @inline def IMAGE_INVERTED = "image-inverted".asInstanceOf[EntypoIconName]
  @inline def IMAGES = "images".asInstanceOf[EntypoIconName]
  @inline def INBOX = "inbox".asInstanceOf[EntypoIconName]
  @inline def INFINITY = "infinity".asInstanceOf[EntypoIconName]
  @inline def INFO = "info".asInstanceOf[EntypoIconName]
  @inline def INFO_WITH_CIRCLE =
    "info-with-circle".asInstanceOf[EntypoIconName]
  @inline def INSTAGRAM = "instagram".asInstanceOf[EntypoIconName]
  @inline def INSTAGRAM_WITH_CIRCLE =
    "instagram-with-circle".asInstanceOf[EntypoIconName]
  @inline def INSTALL = "install".asInstanceOf[EntypoIconName]
  @inline def KEY = "key".asInstanceOf[EntypoIconName]
  @inline def KEYBOARD = "keyboard".asInstanceOf[EntypoIconName]
  @inline def LAB_FLASK = "lab-flask".asInstanceOf[EntypoIconName]
  @inline def LANDLINE = "landline".asInstanceOf[EntypoIconName]
  @inline def LANGUAGE = "language".asInstanceOf[EntypoIconName]
  @inline def LAPTOP = "laptop".asInstanceOf[EntypoIconName]
  @inline def LASTFM = "lastfm".asInstanceOf[EntypoIconName]
  @inline def LASTFM_WITH_CIRCLE =
    "lastfm-with-circle".asInstanceOf[EntypoIconName]
  @inline def LAYERS = "layers".asInstanceOf[EntypoIconName]
  @inline def LEAF = "leaf".asInstanceOf[EntypoIconName]
  @inline def LEVEL_DOWN = "level-down".asInstanceOf[EntypoIconName]
  @inline def LEVEL_UP = "level-up".asInstanceOf[EntypoIconName]
  @inline def LIFEBUOY = "lifebuoy".asInstanceOf[EntypoIconName]
  @inline def LIGHT_BULB = "light-bulb".asInstanceOf[EntypoIconName]
  @inline def LIGHT_DOWN = "light-down".asInstanceOf[EntypoIconName]
  @inline def LIGHT_UP = "light-up".asInstanceOf[EntypoIconName]
  @inline def LINE_GRAPH = "line-graph".asInstanceOf[EntypoIconName]
  @inline def LINK = "link".asInstanceOf[EntypoIconName]
  @inline def LINKEDIN = "linkedin".asInstanceOf[EntypoIconName]
  @inline def LINKEDIN_WITH_CIRCLE =
    "linkedin-with-circle".asInstanceOf[EntypoIconName]
  @inline def LIST = "list".asInstanceOf[EntypoIconName]
  @inline def LOCATION = "location".asInstanceOf[EntypoIconName]
  @inline def LOCATION_PIN = "location-pin".asInstanceOf[EntypoIconName]
  @inline def LOCK = "lock".asInstanceOf[EntypoIconName]
  @inline def LOCK_OPEN = "lock-open".asInstanceOf[EntypoIconName]
  @inline def LOG_OUT = "log-out".asInstanceOf[EntypoIconName]
  @inline def LOGIN = "login".asInstanceOf[EntypoIconName]
  @inline def LOOP = "loop".asInstanceOf[EntypoIconName]
  @inline def MAGNET = "magnet".asInstanceOf[EntypoIconName]
  @inline def MAGNIFYING_GLASS =
    "magnifying-glass".asInstanceOf[EntypoIconName]
  @inline def MAIL = "mail".asInstanceOf[EntypoIconName]
  @inline def MAIL_WITH_CIRCLE =
    "mail-with-circle".asInstanceOf[EntypoIconName]
  @inline def MAN = "man".asInstanceOf[EntypoIconName]
  @inline def MAP = "map".asInstanceOf[EntypoIconName]
  @inline def MASK = "mask".asInstanceOf[EntypoIconName]
  @inline def MEDAL = "medal".asInstanceOf[EntypoIconName]
  @inline def MEDIUM = "medium".asInstanceOf[EntypoIconName]
  @inline def MEDIUM_WITH_CIRCLE =
    "medium-with-circle".asInstanceOf[EntypoIconName]
  @inline def MEGAPHONE = "megaphone".asInstanceOf[EntypoIconName]
  @inline def MENU = "menu".asInstanceOf[EntypoIconName]
  @inline def MERGE = "merge".asInstanceOf[EntypoIconName]
  @inline def MESSAGE = "message".asInstanceOf[EntypoIconName]
  @inline def MIC = "mic".asInstanceOf[EntypoIconName]
  @inline def MINUS = "minus".asInstanceOf[EntypoIconName]
  @inline def MIXI = "mixi".asInstanceOf[EntypoIconName]
  @inline def MOBILE = "mobile".asInstanceOf[EntypoIconName]
  @inline def MODERN_MIC = "modern-mic".asInstanceOf[EntypoIconName]
  @inline def MOON = "moon".asInstanceOf[EntypoIconName]
  @inline def MOUSE = "mouse".asInstanceOf[EntypoIconName]
  @inline def MOUSE_POINTER = "mouse-pointer".asInstanceOf[EntypoIconName]
  @inline def MUSIC = "music".asInstanceOf[EntypoIconName]
  @inline def NETWORK = "network".asInstanceOf[EntypoIconName]
  @inline def NEW = "new".asInstanceOf[EntypoIconName]
  @inline def NEW_MESSAGE = "new-message".asInstanceOf[EntypoIconName]
  @inline def NEWS = "news".asInstanceOf[EntypoIconName]
  @inline def NEWSLETTER = "newsletter".asInstanceOf[EntypoIconName]
  @inline def NOTE = "note".asInstanceOf[EntypoIconName]
  @inline def NOTIFICATION = "notification".asInstanceOf[EntypoIconName]
  @inline def NOTIFICATIONS_OFF =
    "notifications-off".asInstanceOf[EntypoIconName]
  @inline def OLD_MOBILE = "old-mobile".asInstanceOf[EntypoIconName]
  @inline def OLD_PHONE = "old-phone".asInstanceOf[EntypoIconName]
  @inline def ONEDRIVE = "onedrive".asInstanceOf[EntypoIconName]
  @inline def OPEN_BOOK = "open-book".asInstanceOf[EntypoIconName]
  @inline def PALETTE = "palette".asInstanceOf[EntypoIconName]
  @inline def PAPER_PLANE = "paper-plane".asInstanceOf[EntypoIconName]
  @inline def PAYPAL = "paypal".asInstanceOf[EntypoIconName]
  @inline def PENCIL = "pencil".asInstanceOf[EntypoIconName]
  @inline def PHONE = "phone".asInstanceOf[EntypoIconName]
  @inline def PICASA = "picasa".asInstanceOf[EntypoIconName]
  @inline def PIE_CHART = "pie-chart".asInstanceOf[EntypoIconName]
  @inline def PIN = "pin".asInstanceOf[EntypoIconName]
  @inline def PINTEREST = "pinterest".asInstanceOf[EntypoIconName]
  @inline def PINTEREST_WITH_CIRCLE =
    "pinterest-with-circle".asInstanceOf[EntypoIconName]
  @inline def PLUS = "plus".asInstanceOf[EntypoIconName]
  @inline def POPUP = "popup".asInstanceOf[EntypoIconName]
  @inline def POWER_PLUG = "power-plug".asInstanceOf[EntypoIconName]
  @inline def PRICE_RIBBON = "price-ribbon".asInstanceOf[EntypoIconName]
  @inline def PRICE_TAG = "price-tag".asInstanceOf[EntypoIconName]
  @inline def PRINT = "print".asInstanceOf[EntypoIconName]
  @inline def PROGRESS_EMPTY = "progress-empty".asInstanceOf[EntypoIconName]
  @inline def PROGRESS_FULL = "progress-full".asInstanceOf[EntypoIconName]
  @inline def PROGRESS_ONE = "progress-one".asInstanceOf[EntypoIconName]
  @inline def PROGRESS_TWO = "progress-two".asInstanceOf[EntypoIconName]
  @inline def PUBLISH = "publish".asInstanceOf[EntypoIconName]
  @inline def QQ = "qq".asInstanceOf[EntypoIconName]
  @inline def QQ_WITH_CIRCLE = "qq-with-circle".asInstanceOf[EntypoIconName]
  @inline def QUOTE = "quote".asInstanceOf[EntypoIconName]
  @inline def RADIO = "radio".asInstanceOf[EntypoIconName]
  @inline def RAFT = "raft".asInstanceOf[EntypoIconName]
  @inline def RAFT_WITH_CIRCLE =
    "raft-with-circle".asInstanceOf[EntypoIconName]
  @inline def RAINBOW = "rainbow".asInstanceOf[EntypoIconName]
  @inline def RDIO = "rdio".asInstanceOf[EntypoIconName]
  @inline def RDIO_WITH_CIRCLE =
    "rdio-with-circle".asInstanceOf[EntypoIconName]
  @inline def REMOVE_USER = "remove-user".asInstanceOf[EntypoIconName]
  @inline def RENREN = "renren".asInstanceOf[EntypoIconName]
  @inline def REPLY = "reply".asInstanceOf[EntypoIconName]
  @inline def REPLY_ALL = "reply-all".asInstanceOf[EntypoIconName]
  @inline def RESIZE_100_ = "resize-100-".asInstanceOf[EntypoIconName]
  @inline def RESIZE_FULL_SCREEN =
    "resize-full-screen".asInstanceOf[EntypoIconName]
  @inline def RETWEET = "retweet".asInstanceOf[EntypoIconName]
  @inline def ROCKET = "rocket".asInstanceOf[EntypoIconName]
  @inline def ROUND_BRUSH = "round-brush".asInstanceOf[EntypoIconName]
  @inline def RSS = "rss".asInstanceOf[EntypoIconName]
  @inline def RULER = "ruler".asInstanceOf[EntypoIconName]
  @inline def SAVE = "save".asInstanceOf[EntypoIconName]
  @inline def SCISSORS = "scissors".asInstanceOf[EntypoIconName]
  @inline def SCRIBD = "scribd".asInstanceOf[EntypoIconName]
  @inline def SELECT_ARROWS = "select-arrows".asInstanceOf[EntypoIconName]
  @inline def SHARE = "share".asInstanceOf[EntypoIconName]
  @inline def SHARE_ALTERNATIVE =
    "share-alternative".asInstanceOf[EntypoIconName]
  @inline def SHAREABLE = "shareable".asInstanceOf[EntypoIconName]
  @inline def SHIELD = "shield".asInstanceOf[EntypoIconName]
  @inline def SHOP = "shop".asInstanceOf[EntypoIconName]
  @inline def SHOPPING_BAG = "shopping-bag".asInstanceOf[EntypoIconName]
  @inline def SHOPPING_BASKET = "shopping-basket".asInstanceOf[EntypoIconName]
  @inline def SHOPPING_CART = "shopping-cart".asInstanceOf[EntypoIconName]
  @inline def SHUFFLE = "shuffle".asInstanceOf[EntypoIconName]
  @inline def SIGNAL = "signal".asInstanceOf[EntypoIconName]
  @inline def SINA_WEIBO = "sina-weibo".asInstanceOf[EntypoIconName]
  @inline def SKYPE = "skype".asInstanceOf[EntypoIconName]
  @inline def SKYPE_WITH_CIRCLE =
    "skype-with-circle".asInstanceOf[EntypoIconName]
  @inline def SLIDESHARE = "slideshare".asInstanceOf[EntypoIconName]
  @inline def SMASHING = "smashing".asInstanceOf[EntypoIconName]
  @inline def SOUND = "sound".asInstanceOf[EntypoIconName]
  @inline def SOUND_MIX = "sound-mix".asInstanceOf[EntypoIconName]
  @inline def SOUND_MUTE = "sound-mute".asInstanceOf[EntypoIconName]
  @inline def SOUNDCLOUD = "soundcloud".asInstanceOf[EntypoIconName]
  @inline def SPORTS_CLUB = "sports-club".asInstanceOf[EntypoIconName]
  @inline def SPOTIFY = "spotify".asInstanceOf[EntypoIconName]
  @inline def SPOTIFY_WITH_CIRCLE =
    "spotify-with-circle".asInstanceOf[EntypoIconName]
  @inline def SPREADSHEET = "spreadsheet".asInstanceOf[EntypoIconName]
  @inline def SQUARED_CROSS = "squared-cross".asInstanceOf[EntypoIconName]
  @inline def SQUARED_MINUS = "squared-minus".asInstanceOf[EntypoIconName]
  @inline def SQUARED_PLUS = "squared-plus".asInstanceOf[EntypoIconName]
  @inline def STAR = "star".asInstanceOf[EntypoIconName]
  @inline def STAR_OUTLINED = "star-outlined".asInstanceOf[EntypoIconName]
  @inline def STOPWATCH = "stopwatch".asInstanceOf[EntypoIconName]
  @inline def STUMBLEUPON = "stumbleupon".asInstanceOf[EntypoIconName]
  @inline def STUMBLEUPON_WITH_CIRCLE =
    "stumbleupon-with-circle".asInstanceOf[EntypoIconName]
  @inline def SUITCASE = "suitcase".asInstanceOf[EntypoIconName]
  @inline def SWAP = "swap".asInstanceOf[EntypoIconName]
  @inline def SWARM = "swarm".asInstanceOf[EntypoIconName]
  @inline def SWEDEN = "sweden".asInstanceOf[EntypoIconName]
  @inline def SWITCH = "switch".asInstanceOf[EntypoIconName]
  @inline def TABLET = "tablet".asInstanceOf[EntypoIconName]
  @inline def TABLET_MOBILE_COMBO =
    "tablet-mobile-combo".asInstanceOf[EntypoIconName]
  @inline def TAG = "tag".asInstanceOf[EntypoIconName]
  @inline def TEXT = "text".asInstanceOf[EntypoIconName]
  @inline def TEXT_DOCUMENT = "text-document".asInstanceOf[EntypoIconName]
  @inline def TEXT_DOCUMENT_INVERTED =
    "text-document-inverted".asInstanceOf[EntypoIconName]
  @inline def THERMOMETER = "thermometer".asInstanceOf[EntypoIconName]
  @inline def THUMBS_DOWN = "thumbs-down".asInstanceOf[EntypoIconName]
  @inline def THUMBS_UP = "thumbs-up".asInstanceOf[EntypoIconName]
  @inline def THUNDER_CLOUD = "thunder-cloud".asInstanceOf[EntypoIconName]
  @inline def TICKET = "ticket".asInstanceOf[EntypoIconName]
  @inline def TIME_SLOT = "time-slot".asInstanceOf[EntypoIconName]
  @inline def TOOLS = "tools".asInstanceOf[EntypoIconName]
  @inline def TRAFFIC_CONE = "traffic-cone".asInstanceOf[EntypoIconName]
  @inline def TRASH = "trash".asInstanceOf[EntypoIconName]
  @inline def TREE = "tree".asInstanceOf[EntypoIconName]
  @inline def TRIANGLE_DOWN = "triangle-down".asInstanceOf[EntypoIconName]
  @inline def TRIANGLE_LEFT = "triangle-left".asInstanceOf[EntypoIconName]
  @inline def TRIANGLE_RIGHT = "triangle-right".asInstanceOf[EntypoIconName]
  @inline def TRIANGLE_UP = "triangle-up".asInstanceOf[EntypoIconName]
  @inline def TRIPADVISOR = "tripadvisor".asInstanceOf[EntypoIconName]
  @inline def TROPHY = "trophy".asInstanceOf[EntypoIconName]
  @inline def TUMBLR = "tumblr".asInstanceOf[EntypoIconName]
  @inline def TUMBLR_WITH_CIRCLE =
    "tumblr-with-circle".asInstanceOf[EntypoIconName]
  @inline def TV = "tv".asInstanceOf[EntypoIconName]
  @inline def TWITTER = "twitter".asInstanceOf[EntypoIconName]
  @inline def TWITTER_WITH_CIRCLE =
    "twitter-with-circle".asInstanceOf[EntypoIconName]
  @inline def TYPING = "typing".asInstanceOf[EntypoIconName]
  @inline def UNINSTALL = "uninstall".asInstanceOf[EntypoIconName]
  @inline def UNREAD = "unread".asInstanceOf[EntypoIconName]
  @inline def UNTAG = "untag".asInstanceOf[EntypoIconName]
  @inline def UPLOAD = "upload".asInstanceOf[EntypoIconName]
  @inline def UPLOAD_TO_CLOUD = "upload-to-cloud".asInstanceOf[EntypoIconName]
  @inline def USER = "user".asInstanceOf[EntypoIconName]
  @inline def USERS = "users".asInstanceOf[EntypoIconName]
  @inline def V_CARD = "v-card".asInstanceOf[EntypoIconName]
  @inline def VIDEO = "video".asInstanceOf[EntypoIconName]
  @inline def VIDEO_CAMERA = "video-camera".asInstanceOf[EntypoIconName]
  @inline def VIMEO = "vimeo".asInstanceOf[EntypoIconName]
  @inline def VIMEO_WITH_CIRCLE =
    "vimeo-with-circle".asInstanceOf[EntypoIconName]
  @inline def VINE = "vine".asInstanceOf[EntypoIconName]
  @inline def VINE_WITH_CIRCLE =
    "vine-with-circle".asInstanceOf[EntypoIconName]
  @inline def VINYL = "vinyl".asInstanceOf[EntypoIconName]
  @inline def VK = "vk".asInstanceOf[EntypoIconName]
  @inline def VK_ALTERNITIVE = "vk-alternitive".asInstanceOf[EntypoIconName]
  @inline def VK_WITH_CIRCLE = "vk-with-circle".asInstanceOf[EntypoIconName]
  @inline def VOICEMAIL = "voicemail".asInstanceOf[EntypoIconName]
  @inline def WALLET = "wallet".asInstanceOf[EntypoIconName]
  @inline def WARNING = "warning".asInstanceOf[EntypoIconName]
  @inline def WATER = "water".asInstanceOf[EntypoIconName]
  @inline def WINDOWS_STORE = "windows-store".asInstanceOf[EntypoIconName]
  @inline def XING = "xing".asInstanceOf[EntypoIconName]
  @inline def XING_WITH_CIRCLE =
    "xing-with-circle".asInstanceOf[EntypoIconName]
  @inline def YELP = "yelp".asInstanceOf[EntypoIconName]
  @inline def YOUKO = "youko".asInstanceOf[EntypoIconName]
  @inline def YOUKO_WITH_CIRCLE =
    "youko-with-circle".asInstanceOf[EntypoIconName]
  @inline def YOUTUBE = "youtube".asInstanceOf[EntypoIconName]
  @inline def YOUTUBE_WITH_CIRCLE =
    "youtube-with-circle".asInstanceOf[EntypoIconName]
}