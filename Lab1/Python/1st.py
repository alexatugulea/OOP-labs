class Monitor:
    def __init__(self, color=None, width=None, height=None, resolution=None):
        self.color = color
        self.width = width
        self.height = height
        self.resolution = resolution

    def print_monitor(self):
        print("Monitor : color {}, width - {}, length - {}, resolution - {}".format(self.color, self.width,
                                                                                    self.height,
                                                                                    self.resolution))

monitor1 = Monitor()
monitor1.color = "black"
monitor1.width = 100
monitor1.height = 75
monitor1.resolution = "Fullhd"

monitor2 = Monitor()
monitor2.color = "silver"
monitor2.width = 200
monitor2.height = 150
monitor2.resolution = "4k"

monitor1.print_monitor()
monitor2.print_monitor()
